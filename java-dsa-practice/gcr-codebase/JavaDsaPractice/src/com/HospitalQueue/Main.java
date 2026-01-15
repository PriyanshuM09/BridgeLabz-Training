package com.HospitalQueue;

public class Main {
    public static void main(String[] args) {

        Patient[] erQueue = {
            new Patient("Rahul", 3),
            new Patient("Anita", 8),
            new Patient("Vikram", 5),
            new Patient("Sonia", 10),
            new Patient("Aman", 2)
        };

        System.out.println("Before Sorting (Arrival Order):");
        HospitalQueue.displayQueue(erQueue);

        HospitalQueue.sortByCriticality(erQueue);

        System.out.println("\nAfter Sorting (By Criticality):");
        HospitalQueue.displayQueue(erQueue);
    }
}

