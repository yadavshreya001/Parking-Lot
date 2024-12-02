package models;
import java.util.List;

public class ParkingFloor extends BaseModel {
    private List<ParkingSpot> parkingSpots;  // List of all parking spots on the floor
    private ParkingFloorStatus parkingFloorStatus;  // Status of the parking floor (e.g., Open, Full, Closed)
    private int floorNumber;    // Unique number or identifier for the floor

    // Getter method for parkingSpots
    public List<ParkingSpot> getParkingSpots() {
        return parkingSpots;
    }
    // Setter method for parkingSpots
    public void setParkingSpots(List<ParkingSpot> parkingSpots) {
        this.parkingSpots = parkingSpots;
    }
    // Getter method for parkingFloorStatus
    public ParkingFloorStatus getParkingFloorStatus() {
        return parkingFloorStatus;
    }
    // Setter method for parkingFloorStatus
    public void setParkingFloorStatus(ParkingFloorStatus parkingFloorStatus) {
        this.parkingFloorStatus = parkingFloorStatus;
    }
    // Getter method for floorNumber
    public int getFloorNumber() {
        return floorNumber;
    }
    // Setter method for floorNumber
    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }
}