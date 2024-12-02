package models;

public enum ParkingFloorStatus {
    AVAILABLE,                 // The floor is open and has available parking spots
    NOT_AVAILABLE,            // The floor is full or temporarily closed for parking.
    UNDER_CONSTRUCTION,      // The floor is undergoing maintenance or construction and is inaccessible.
}
