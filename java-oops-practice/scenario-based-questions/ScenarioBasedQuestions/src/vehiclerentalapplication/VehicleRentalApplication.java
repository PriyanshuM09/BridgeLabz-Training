package vehiclerentalapplication;

public class VehicleRentalApplication {
    public static void main(String[] args) {

        Customer customer = new Customer("Priyanshu");

        Rentable[] vehicles = new Rentable[3];

        vehicles[0] = new Bike("BIKE101", 300);
        vehicles[1] = new Car("CAR202", 1500);
        vehicles[2] = new Truck("TRUCK303", 3000);

        int days = 3;

        System.out.println("Customer: " + customer.getCustomerName());
        System.out.println("Rental Duration: " + days + " days\n");

        for (Rentable v : vehicles) {
            System.out.println("Rent Amount: " + v.calculateRent(days));
        }
    }
}

