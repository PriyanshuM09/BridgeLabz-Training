package smarthomeautomationsystem;

public class Light extends Appliance implements Controllable {

    public Light(String name) {
        super(name, 0.5);
    }

    @Override
    public void turnOn() {
        setPowerOn(true);
        System.out.println("Light turned ON");
    }

    @Override
    public void turnOff() {
        setPowerOn(false);
        System.out.println("Light turned OFF");
    }
}

