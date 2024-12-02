package models;

public class Gate extends BaseModel {
    private Operator operator;        // The person or system managing the gate
    private GateType gateType;       // Type of gate (ENTRY or EXIT)
    private GateStatus gateStatus;  // Current status of the gate (OPEN, CLOSED, etc.)
    private String gateNumber;      // Unique identifier for the gate

    // Getter and Setter for Operator
    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    // Getter and Setter for GateType
    public GateType getGateType() {
        return gateType;
    }

    // Getter and Setter for GateStatus
    public void setGateType(GateType gateType) {
        this.gateType = gateType;
    }

    public GateStatus getGateStatus() {
        return gateStatus;
    }

    public void setGateStatus(GateStatus gateStatus) {
        this.gateStatus = gateStatus;
    }

    // Getter and Setter for GateNumber
    public String getGateNumber() {
        return gateNumber;
    }

    public void setGateNumber(String gateNumber) {
        this.gateNumber = gateNumber;
    }
}