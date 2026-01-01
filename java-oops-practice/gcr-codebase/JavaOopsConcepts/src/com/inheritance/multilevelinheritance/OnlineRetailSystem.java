package com.inheritance.multilevelinheritance;

public class OnlineRetailSystem {
    public static void main(String[] args) {

        Order o1 = new Order(101, "01-01-2025");
        Order o2 = new ShippedOrder(102, "02-01-2025", "TRK123");
        Order o3 = new DeliveredOrder(103, "03-01-2025", "TRK456", "05-01-2025");

        System.out.println("Order 1 Status: " + o1.getOrderStatus());
        System.out.println("Order 2 Status: " + o2.getOrderStatus());
        System.out.println("Order 3 Status: " + o3.getOrderStatus());
    }
}

