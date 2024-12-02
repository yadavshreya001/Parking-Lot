package models;
import java.util.Date;

public class Payment extends BaseModel {
    private int amount;     // The amount of money paid for the parking.
    private PaymentMode paymentMode;    // The mode of payment (e.g., cash, credit card, etc.).
    private PaymentStatus paymentStatus;   // The status of the payment (e.g., successful, failed).
    private Date time;      // The date and time when the payment was made.
    private String referenceNumber; // A unique reference number for the payment transaction.

    // Getter and Setter methods for each field.
    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public PaymentMode getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(PaymentMode paymentMode) {
        this.paymentMode = paymentMode;
    }

    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getReferenceNumber() {
        return referenceNumber;
    }

    public void setReferenceNumber(String referenceNumber) {
        this.referenceNumber = referenceNumber;
    }
}