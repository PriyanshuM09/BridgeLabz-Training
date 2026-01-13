package homenest;

public class HomeNestManager {
    public static void main(String[] args) {

        Device light = new Light("Light-101");
        Device cam = new Camera("Cam-202");
        Device thermo = new Thermostat("Thermo-303");
        Device lock = new Lock("Lock-404");

        light.turnOn();
        cam.turnOn();
        thermo.turnOn();
        lock.turnOn();

        light.reset();
        cam.reset();
        thermo.reset();
        lock.reset();

        double energy = thermo.calculateEnergy(5);
        System.out.println("Energy used by Thermostat: " + energy + " units");
    }
}



