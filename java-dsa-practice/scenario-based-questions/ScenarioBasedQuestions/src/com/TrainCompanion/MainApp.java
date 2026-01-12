package com.TrainCompanion;

public class MainApp {

    public static void main(String[] args) {

        TrainRoute route = new TrainRoute();

        route.addCompartment("Engine");
        route.addCompartment("Sleeper");
        route.addCompartment("Pantry");
        route.addCompartment("AC");
        route.addCompartment("WiFi");

        route.moveForward();
        route.moveBackward();

        route.showNearby("Pantry");

        route.removeCompartment("AC");

        route.moveForward();
    }
}

