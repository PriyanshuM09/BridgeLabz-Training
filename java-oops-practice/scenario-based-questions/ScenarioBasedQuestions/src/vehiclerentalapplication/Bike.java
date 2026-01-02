package vehiclerentalapplication;

public class Bike extends Vehicle implements Rentable {

    public Bike(String vehicleNumber, double baseRate) {
        super(vehicleNumber, baseRate);
    }

    @Override
    public double calculateRent(int days) {
        return baseRate * days;   // simple rent
    }
}

