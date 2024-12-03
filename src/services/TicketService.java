package services;
import exception.GateNotFoundException;
import exception.SpotNotAvailableException;
import factories.SpotAssignmentStrategyFactory;
import models.*;
import repositories.GateRepository;
import repositories.ParkingLotRepository;
import repositories.TicketRepository;
import repositories.VehicleRepository;
import strategies.SpotAssignmentStrategy;
import java.util.Date;
import java.util.Optional;

/**
 * Service class responsible for the core logic of issuing parking tickets.
 */
public class TicketService {
    private GateRepository gateRepository;
    private VehicleRepository vehicleRepository;
    private ParkingLotRepository parkingLotRepository;
    private TicketRepository ticketRepository;

    /**
     * Constructor to initialize the TicketService with required repositories.
     */
    public TicketService(GateRepository gateRepository,
                         VehicleRepository vehicleRepository,
                         ParkingLotRepository parkingLotRepository,
                         TicketRepository ticketRepository) {
        this.gateRepository = gateRepository;
        this.vehicleRepository = vehicleRepository;
        this.parkingLotRepository = parkingLotRepository;
        this.ticketRepository = ticketRepository;
    }

    /**
     * Issues a parking ticket by validating gate and vehicle details,
     * and assigning a parking spot based on the vehicle type.
     * @param gateId - ID of the entry gate.
     * @param vehicleNumber - Vehicle's registration number.
     * @param ownerName - Owner's name.
     * @param vehicleType - Type of the vehicle (Car, Bike, etc.).
     * @return Ticket - The issued parking ticket.
     * @throws GateNotFoundException - Thrown if the gate ID is invalid.
     * @throws SpotNotAvailableException - Thrown if no spot is available.
     */
    public Ticket issueTicket(Long gateId,
                              String vehicleNumber,
                              String ownerName,
                              VehicleType vehicleType) throws GateNotFoundException, SpotNotAvailableException {

        Ticket ticket = new Ticket();
        ticket.setEntryTime(new Date()); // Set the entry time of the ticket.

        // Validate and fetch the gate details.
        Optional<Gate> optionalGate = gateRepository.findById(gateId);

        if (optionalGate.isEmpty()) {
            throw new GateNotFoundException("Gate with id: " + gateId + " not found.");
        }
        Gate gate = optionalGate.get();
        ticket.setGeneratedAt(gate);

        // Check if the vehicle already exists, if not, create a new one
        Optional<Vehicle> optionalVehicle = vehicleRepository.findByVehicleNumber(vehicleNumber);

        Vehicle savedVehicle = null;

        if (optionalVehicle.isEmpty()) {
            //Create a new Vehicle and save it in the DB.
            Vehicle vehicle = new Vehicle();
            vehicle.setVehicleNumber(vehicleNumber);
            vehicle.setOwnerName(ownerName);
            vehicle.setVehicleType(vehicleType);
            savedVehicle = vehicleRepository.save(vehicle);
        } else {
            savedVehicle = optionalVehicle.get();
        }

        ticket.setVehicle(savedVehicle);

        // Assign a ticket number (can be replaced with a more sophisticated logic).
        ticket.setNumber("ticket-number");

        // Fetch the parking lot details based on the gate.
        Optional<ParkingLot> optionalParkingLot = parkingLotRepository.findByGateId(gateId);

        if (optionalParkingLot.isEmpty()) {
            throw new RuntimeException("Invalid ParkingLot");
        }

        ParkingLot parkingLot = optionalParkingLot.get();

        // Assign a parking spot using the appropriate strategy.
        SpotAssignmentStrategy spotAssignmentStrategy = SpotAssignmentStrategyFactory.
                getSpotAssignmentStrategy(parkingLot.getSpotAssignmentStrategyType());


        ParkingSpot parkingSpot = spotAssignmentStrategy.assignSpot(vehicleType, gate);

        if (parkingSpot.getParkingSpotStatus().equals(ParkingSpotStatus.NOT_AVAILABLE)) {
            throw new SpotNotAvailableException("Spot not available.");
        }

        ticket.setParkingSpot(parkingSpot);


        // Save and return the ticket.
        return ticketRepository.save(ticket);
    }
}