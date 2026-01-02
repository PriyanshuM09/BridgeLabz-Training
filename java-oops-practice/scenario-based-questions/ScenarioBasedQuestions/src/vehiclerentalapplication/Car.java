package vehiclerentalapplication;

public class Car extends Vehicle implements Rentable {

    private double luxuryCharge = 500;

    public Car(String vehicleNumber, double baseRate) {
        super(vehicleNumber, baseRate);
    }

    @Override
    public double calculateRent(int days) {
        return (baseRate * days) + luxuryCharge;
    }
}

