package com.encapsulation;

public class VehicleRentalSystem {
    public static void main(String[] args) {

        Vehicle[] vehicles = new Vehicle[3];

        vehicles[0] = new Car("CAR101", 2000, "CAR-INS-001");
        vehicles[1] = new Bike("BIKE202", 800, "BIKE-INS-002");
        vehicles[2] = new Truck("TRUCK303", 5000, "TRUCK-INS-003");

        int rentalDays = 3;

        for (Vehicle v : vehicles) {

            double rentalCost = v.calculateRentalCost(rentalDays);
            double insuranceCost = ((Insurable) v).calculateInsurance();

            System.out.println("Vehicle Type: " + v.getType());
            System.out.println("Vehicle Number: " + v.getVehicleNumber());
            System.out.println("Rental Cost: " + rentalCost);
            System.out.println("Insurance Cost: " + insuranceCost);
            System.out.println(((Insurable) v).getInsuranceDetails());
            System.out.println();
        }
    }
}

