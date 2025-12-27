package com.constructors.levelone;

public class CarRental {

    String customerName;
    String carModel;
    int rentalDays;

    static final int COST_PER_DAY = 1000;

    // Default Constructor
    CarRental() {
        customerName = "Not Assigned";
        carModel = "Standard";
        rentalDays = 1;
    }

    // Parameterized Constructor
    CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    int calculateTotalCost() {
        return rentalDays * COST_PER_DAY;
    }

    void displayRentalDetails() {
        System.out.println("Customer Name : " + customerName);
        System.out.println("Car Model     : " + carModel);
        System.out.println("Rental Days   : " + rentalDays);
        System.out.println("Total Cost    : ₹" + calculateTotalCost());
        System.out.println();
    }

    public static void main(String[] args) {

        // Using default constructor
        CarRental r1 = new CarRental();
        r1.displayRentalDetails();

        // Using parameterized constructor
        CarRental r2 = new CarRental("Priyanshu", "Honda City", 4);
        r2.displayRentalDetails();
    }
}

