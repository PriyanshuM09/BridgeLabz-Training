package homenest;

public class Device implements IControllable {
    protected String deviceId;
    private boolean status;
    protected double energyUsage;

    public Device(String deviceId, double energyUsage) {
        this.deviceId = deviceId;
        this.energyUsage = energyUsage;
        this.status = false;
    }

    public boolean isOn() {
        return status;
    }

    protected void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public void turnOn() {
        setStatus(true);
        System.out.println(deviceId + " turned ON");
    }

    @Override
    public void turnOff() {
        setStatus(false);
        System.out.println(deviceId + " turned OFF");
    }

    @Override
    public void reset() {
        System.out.println(deviceId + " reset to default");
    }


    public double calculateEnergy(int hours) {
        return energyUsage * hours;
    }

    protected void firmwareLog(String msg) {
        System.out.println("Firmware Log: " + msg);
    }
}
