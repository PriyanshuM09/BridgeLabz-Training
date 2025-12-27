package com.constructors.levelone;

public class Vehicle{
	 // Instance Variables
    String ownerName;
    String vehicleType;

    static double registrationFee = 1500.0;

    // Parameterized Constructor
    Vehicle(String ownerName, String vehicleType){
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Instance Method
    void displayVehicleDetails() {
        System.out.println("Owner Name  : " + ownerName);
        System.out.println("Vehicle Type : " + vehicleType);
        System.out.println("Registration Fee : " + registrationFee);
        System.out.println();
    }

    // Class Method
    static void updateRegistrationFee(double newFee){
        registrationFee= newFee;
    }

}
