package cabbygo;

class Vehicle {
    protected String vehicleNumber;
    protected int capacity;
    protected String type;

    protected double ratePerKm;
    private double fare;   

    Vehicle(String vehicleNumber, int capacity, String type, double ratePerKm) {
        this.vehicleNumber = vehicleNumber;
        this.capacity = capacity;
        this.type = type;
        this.ratePerKm = ratePerKm;
    }

    protected void calculateFare(double baseFare, double distance) {
        fare = baseFare + (distance * ratePerKm); // operator usage
    }

    public double getFare() {
        return fare;
    }

    public String getVehicleInfo() {
        return type + " (" + vehicleNumber + ")";
    }
}
