package com.inheritance;

public class TransportSystem {
    public static void main(String[] args) {

        Vehicle[] vehicles = new Vehicle[3];

        vehicles[0] = new Car(180, "Petrol", 5);
        vehicles[1] = new Truck(120, "Diesel", 10);
        vehicles[2] = new Motorcycle(160, "Petrol", true);

        for (int i = 0; i < vehicles.length; i++) {
            System.out.println("Vehicle " + (i + 1) + " Details:");
            vehicles[i].displayInfo();
            System.out.println();
        }
    }
}

