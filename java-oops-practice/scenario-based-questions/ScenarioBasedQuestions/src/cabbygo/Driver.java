package cabbygo;

public class Driver {
    private String name;
    private String licenseNumber;
    private double rating; // private as required

    Driver(String name, String licenseNumber, double rating) {
        this.name = name;
        this.licenseNumber = licenseNumber;
        this.rating = rating;
    }

    public String getDriverDetails() {
        return name + " | Rating: " + rating;
    }
}
