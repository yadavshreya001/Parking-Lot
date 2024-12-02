package models;
import java.util.List;

public class ParkingLot extends BaseModel {
    private List<ParkingFloor> parkingFloors;   // List of floors in the parking lot.
    private List<Gate> gates;        // List of entry and exit gates.
    private List<VehicleType> supportedVehicleTypes;     // Vehicle types the parking lot can accommodate.
    private FeeCalculationStrategyType feeCalculationStrategyType;  // Strategy used for fee calculation.
    private SpotAssignmentStrategyType spotAssignmentStrategyType;  // Strategy used for assigning parking spots.
    private String address;  // Physical address of the parking lot.

    // Getter and Setter methods for each field
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<ParkingFloor> getParkingFloors() {
        return parkingFloors;
    }

    public void setParkingFloors(List<ParkingFloor> parkingFloors) {
        this.parkingFloors = parkingFloors;
    }

    public List<Gate> getGates() {
        return gates;
    }

    public void setGates(List<Gate> gates) {
        this.gates = gates;
    }

    public List<VehicleType> getSupportedVehicleTypes() {
        return supportedVehicleTypes;
    }

    public void setSupportedVehicleTypes(List<VehicleType> supportedVehicleTypes) {
        this.supportedVehicleTypes = supportedVehicleTypes;
    }

    public FeeCalculationStrategyType getFeeCalculationStrategyType() {
        return feeCalculationStrategyType;
    }

    public void setFeeCalculationStrategyType(FeeCalculationStrategyType feeCalculationStrategyType) {
        this.feeCalculationStrategyType = feeCalculationStrategyType;
    }

    public SpotAssignmentStrategyType getSpotAssignmentStrategyType() {
        return spotAssignmentStrategyType;
    }

    public void setSpotAssignmentStrategyType(SpotAssignmentStrategyType spotAssignmentStrategyType) {
        this.spotAssignmentStrategyType = spotAssignmentStrategyType;
    }
}