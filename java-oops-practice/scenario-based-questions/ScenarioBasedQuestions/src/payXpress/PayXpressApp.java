package payXpress;

public class PayXpressApp {

    public static void main(String[] args) {

        Bill b1 = new ElectricityBill(1200, "20-Jan-2026");
        Bill b2 = new WaterBill(450, "18-Jan-2026");
        Bill b3 = new InternetBill(999, "15-Jan-2026");

        // Polymorphism in action
        b1.sendReminder();
        b2.sendReminder();
        b3.sendReminder();

        // Pay bills
        b1.pay();

        // Late fee calculation
        double lateFee = b2.calculateLateFee(50);
        System.out.println("Water bill after penalty: ₹" + lateFee);

        // Encapsulation check
        System.out.println("Electricity bill paid? " + b1.getPaymentStatus());
    }
}

