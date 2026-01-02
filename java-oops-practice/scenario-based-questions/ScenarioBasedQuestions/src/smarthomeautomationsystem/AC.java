package smarthomeautomationsystem;

public class AC extends Appliance implements Controllable {

    public AC(String name) {
        super(name, 3.5);
    }

    @Override
    public void turnOn() {
        setPowerOn(true);
        System.out.println("AC cooling started");
    }

    @Override
    public void turnOff() {
        setPowerOn(false);
        System.out.println("AC turned OFF");
    }
}
