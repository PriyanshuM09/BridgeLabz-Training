package cabbygo;

public class RideService implements IRideService {
    private Driver driver;
    private Vehicle vehicle;
    private boolean rideActive = false;

    RideService(Driver driver, Vehicle vehicle) {
        this.driver = driver;
        this.vehicle = vehicle;
    }

    @Override
    public void bookRide(double distance) {
        rideActive = true;
        vehicle.calculateFare(50, distance); // baseFare = 50
        System.out.println("Ride Booked ");
        System.out.println("Driver: " + driver.getDriverDetails());
        System.out.println("Vehicle: " + vehicle.getVehicleInfo());
        System.out.println("Estimated Fare: ₹" + vehicle.getFare());
    }

    @Override
    public void endRide() {
        if (rideActive) {
            rideActive = false;
            System.out.println("Ride Ended ");
            System.out.println("Final Fare: ₹" + vehicle.getFare());
        } else {
            System.out.println("No active ride!");
        }
    }
}

