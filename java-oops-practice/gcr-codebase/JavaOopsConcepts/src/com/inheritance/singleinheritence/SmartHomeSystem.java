package com.inheritance.singleinheritence;

public class SmartHomeSystem {
    public static void main(String[] args) {

        Device device = new Thermostat(101, "ON", 24);
        device.displayStatus();
    }
}

