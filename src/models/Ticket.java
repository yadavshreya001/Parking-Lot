package models;
import java.util.Date;

// The Ticket class represents a parking ticket issued when a vehicle enters the parking lot.
// It tracks the vehicle's entry time, parking spot, and the gate where the ticket was generated.
public class Ticket extends BaseModel {
    private String number;     // Unique identifier for the parking ticket.
    private Date entryTime;   // The timestamp of when the vehicle entered the parking lot
    private Vehicle vehicle;     // The vehicle associated with the parking ticket.
    private ParkingSpot parkingSpot;  // The parking spot assigned to the vehicle.
    private Gate generatedAt;   // The gate where the ticket was generated when the vehicle entered.

    // Getter and Setter methods
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Date getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(Date entryTime) {
        this.entryTime = entryTime;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }

    public void setParkingSpot(ParkingSpot parkingSpot) {
        this.parkingSpot = parkingSpot;
    }

    public Gate getGeneratedAt() {
        return generatedAt;
    }

    public void setGeneratedAt(Gate generatedAt) {
        this.generatedAt = generatedAt;
    }
}

