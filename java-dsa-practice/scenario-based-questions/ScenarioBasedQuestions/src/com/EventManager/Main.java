package com.EventManager;

public class Main {
    public static void main(String[] args) {

        Ticket[] tickets = { new Ticket(2500), new Ticket(1200), new Ticket(5000), new Ticket(800),
            new Ticket(3000), new Ticket(1500)};

        System.out.println("Before Sorting:");
        EventManagerSorter.display(tickets);

        EventManagerSorter.quickSort(tickets, 0, tickets.length - 1);

        System.out.println("\nAfter Sorting (By Price):");
        EventManagerSorter.display(tickets);
    }
}
