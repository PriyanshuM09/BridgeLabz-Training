package vehiclerentalapplication;

public class Truck extends Vehicle implements Rentable {

    private double loadCharge = 1000;

    public Truck(String vehicleNumber, double baseRate) {
        super(vehicleNumber, baseRate);
    }

    @Override
    public double calculateRent(int days) {
        return (baseRate * days) + loadCharge;
    }
}

