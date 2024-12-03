package dtos;
import models.VehicleType;

/**
 * Data Transfer Object (DTO) for issuing a parking ticket request.
 * This class is used to encapsulate the data required when a vehicle enters
 * the parking lot and requests a parking ticket.
 */

public class IssueTicketRequestDto {
    private Long gateId;                 // ID of the gate where the vehicle is entering
    private String vehicleNumber;       // Registration number of the vehicle
    private VehicleType vehicleType;   // Type of the vehicle (e.g., Car, Bike, Truck)
    private String ownerName;         // Name of the vehicle's owner

    //Getter and Setter for the fields
    public Long getGateId() {
        return gateId;
    }

    public void setGateId(Long gateId) {
        this.gateId = gateId;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
}

