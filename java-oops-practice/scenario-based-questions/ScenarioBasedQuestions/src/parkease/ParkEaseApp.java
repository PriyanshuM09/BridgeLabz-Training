package parkease;

public class ParkEaseApp {

    public static void main(String[] args) {

        Vehicle car = new Car("UP32AB1234");
        Vehicle bike = new Bike("UP32BK5678");

        ParkingSlot carSlot = new ParkingSlot("C1", "Car");
        ParkingSlot bikeSlot = new ParkingSlot("B1", "Bike");

        carSlot.assignSlot(car);
        bikeSlot.assignSlot(bike);

        int hours = 6;

        System.out.println("Car Parking Charges: ₹" +
                car.calculateCharges(hours));

        System.out.println("Bike Parking Charges: ₹" +
                bike.calculateCharges(hours));

        System.out.println("Car Slot Log: " + carSlot.getBookingLog());
        System.out.println("Bike Slot Log: " + bikeSlot.getBookingLog());
    }
}

