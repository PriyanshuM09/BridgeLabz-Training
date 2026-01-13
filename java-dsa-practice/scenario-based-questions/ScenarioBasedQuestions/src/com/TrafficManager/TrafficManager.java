package com.TrafficManager;

public class TrafficManager {
    public static void main(String[] args) {

        WaitingQueue queue = new WaitingQueue();
        Roundabout roundabout = new Roundabout();

        queue.addCar("CAR-101");
        queue.addCar("CAR-102");
        queue.addCar("CAR-103");

        roundabout.addCar(queue.removeCar());
        roundabout.addCar(queue.removeCar());

        roundabout.display();

        roundabout.removeCar();
        roundabout.display();

        roundabout.addCar(queue.removeCar());
        roundabout.display();
    }
}

