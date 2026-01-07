package parkease;

public class ParkingSlot {

    private String slotId;
    private boolean isOccupied;
    private String vehicleTypeAllowed;

    // internal booking record
    private String bookingLog;

    public ParkingSlot(String slotId, String vehicleTypeAllowed) {
        this.slotId = slotId;
        this.vehicleTypeAllowed = vehicleTypeAllowed;
        this.isOccupied = false;
    }

    public boolean isAvailable() {
        return !isOccupied;
    }

    public void assignSlot(Vehicle vehicle) {
        if (!isOccupied &&
            vehicle.getClass().getSimpleName().equals(vehicleTypeAllowed)) {

            isOccupied = true;
            bookingLog = "Slot " + slotId + " booked for " +
                         vehicle.getClass().getSimpleName();
            System.out.println(bookingLog);
        } else {
            System.out.println("Slot not available or vehicle type mismatch");
        }
    }

    public void releaseSlot() {
        isOccupied = false;
    }

    // Expose booking info safely
    public String getBookingLog() {
        return bookingLog;
    }
}
