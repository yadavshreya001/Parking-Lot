package models;
import java.util.List;

public class ParkingSpot extends BaseModel {
    private int parkingSpotNumber;   // Unique number assigned to the parking spot.
    private ParkingSpotStatus parkingSpotStatus;      // Current status of the parking spot (e.g., AVAILABLE or OCCUPIED).
    private List<VehicleType> supportedVehicleTypes;   // List of vehicle types that can be parked in this spot.

    // Getter and Setter methods for each field
    public int getParkingSpotNumber() {
        return parkingSpotNumber;
    }

    public void setParkingSpotNumber(int parkingSpotNumber) {
        this.parkingSpotNumber = parkingSpotNumber;
    }

    public ParkingSpotStatus getParkingSpotStatus() {
        return parkingSpotStatus;
    }

    public void setParkingSpotStatus(ParkingSpotStatus parkingSpotStatus) {
        this.parkingSpotStatus = parkingSpotStatus;
    }

    public List<VehicleType> getSupportedVehicleTypes() {
        return supportedVehicleTypes;
    }

    public void setSupportedVehicleTypes(List<VehicleType> supportedVehicleTypes) {
        this.supportedVehicleTypes = supportedVehicleTypes;
    }
}