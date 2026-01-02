package smarthomeautomationsystem;

public class Appliance {

    protected String name;
    private boolean powerOn;        // encapsulated
    private double energyUsage;     // units per hour

    public Appliance(String name, double energyUsage) {
        this.name = name;
        this.energyUsage = energyUsage;
        this.powerOn = false;
    }

    protected void setPowerOn(boolean status) {
        this.powerOn = status;
    }

    public boolean isPowerOn() {
        return powerOn;
    }

    public double getEnergyUsage() {
        return energyUsage;
    }
}

