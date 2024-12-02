package models;

public class Vehicle extends BaseModel {
    private String vehicleNumber;    // The vehicle's unique identification number (license plate).
    private String ownerName;      // The name of the owner of the vehicle.
    private VehicleType vehicleType;  // The type of the vehicle, which could be car, bike, etc.

    // Getter and Setter methods
    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

}

