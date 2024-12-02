package models;

import java.util.Date;
import java.util.List;

public class Bill extends BaseModel {
    private Ticket ticket; // Represents the parking ticket details
    private Gate gate; // Represents the gate the vehicle exits from
    private BillStatus billStatus; // Tracks the current status of the bill (PAID or PENDING)
    private int amount; // The total amount to be paid for parking
    private List<Payment> payments;  // List of payments made for the bill
    private Date exitTime;   // The time the vehicle exits the parking lot
    private FeeCalculationStrategyType feeCalculationStrategyType; // Strategy for calculating parking fees

    // Getters and Setters for each field
    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public Gate getGate() {
        return gate;
    }

    public void setGate(Gate gate) {
        this.gate = gate;
    }

    public BillStatus getBillStatus() {
        return billStatus;
    }

    public void setBillStatus(BillStatus billStatus) {
        this.billStatus = billStatus;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public List<Payment> getPayments() {
        return payments;
    }

    public void setPayments(List<Payment> payments) {
        this.payments = payments;
    }

    public Date getExitTime() {
        return exitTime;
    }

    public void setExitTime(Date exitTime) {
        this.exitTime = exitTime;
    }

    public FeeCalculationStrategyType getFeeCalculationStrategyType() {
        return feeCalculationStrategyType;
    }

    public void setFeeCalculationStrategyType(FeeCalculationStrategyType feeCalculationStrategyType) {
        this.feeCalculationStrategyType = feeCalculationStrategyType;
    }
}