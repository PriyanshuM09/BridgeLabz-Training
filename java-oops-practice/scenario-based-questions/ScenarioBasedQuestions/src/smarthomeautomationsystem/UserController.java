package smarthomeautomationsystem;

public class UserController {
    public static void main(String[] args) {

        Controllable[] devices = new Controllable[3];

        devices[0] = new Light("Room Light");
        devices[1] = new Fan("Ceiling Fan");
        devices[2] = new AC("Split AC");

        for (Controllable device : devices) {
            device.turnOn();
        }

        System.out.println();

        Appliance a1 = (Appliance) devices[0];
        Appliance a2 = (Appliance) devices[2];

        if (a1.getEnergyUsage() < a2.getEnergyUsage()) {
            System.out.println("Light consumes less energy than AC");
        }

        devices[2].turnOff();
    }
}
