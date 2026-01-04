package cabbygo;

public class CabbyGoApp {
    public static void main(String[] args) {

        Driver driver = new Driver("Rahul Sharma", "DL12345", 4.8);
        Vehicle vehicle = new Sedan("KA01AB1234");
        IRideService ride = new RideService(driver, vehicle);
        ride.bookRide(12); 
        ride.endRide();
    }
}

