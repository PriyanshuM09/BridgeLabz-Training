package com.TrafficManager;

public class Roundabout {
    CarNode tail = null;

    public void addCar(String carNumber) {
        if (carNumber == null) return;

        CarNode newCar = new CarNode(carNumber);

        if (tail == null) {
            tail = newCar;
            tail.next = tail;
        } else {
            newCar.next = tail.next;
            tail.next = newCar;
            tail = newCar;
        }

        System.out.println(carNumber + " entered the roundabout.");
    }

    public void removeCar() {
        if (tail == null) {
            System.out.println("Roundabout is empty!");
            return;
        }

        CarNode head = tail.next;

        if (head == tail) {
            System.out.println(head.carNumber + " exited.");
            tail = null;
        } else {
            System.out.println(head.carNumber + " exited.");
            tail.next = head.next;
        }
    }

    public void display() {
        if (tail == null) {
            System.out.println("Roundabout is empty.");
            return;
        }

        CarNode temp = tail.next;
        System.out.print("Roundabout: ");

        do {
            System.out.print(temp.carNumber + " -> ");
            temp = temp.next;
        } while (temp != tail.next);

        System.out.println("(back to start)");
    }
}

