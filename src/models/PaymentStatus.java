package models;

public enum PaymentStatus {
    PENDING,   // Represents a payment that has been initiated but not yet completed.
    CONFIRMED, // Represents a payment that has been successfully completed and confirmed.
    CANCELLED  // Represents a payment that has been cancelled, either by the user or system.
}
