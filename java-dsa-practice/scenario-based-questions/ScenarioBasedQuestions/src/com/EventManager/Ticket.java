package com.EventManager;

public class Ticket {
    double price;

    public Ticket(double price) {
        this.price = price;
    }

    public void display() {
        System.out.println("rs " + price);
    }
}

