package smarthomeautomationsystem;

public class Fan extends Appliance implements Controllable {

    public Fan(String name) {
        super(name, 1.2);
    }

    @Override
    public void turnOn() {
        setPowerOn(true);
        System.out.println("Fan started spinning");
    }

    @Override
    public void turnOff() {
        setPowerOn(false);
        System.out.println("Fan stopped");
    }
}
