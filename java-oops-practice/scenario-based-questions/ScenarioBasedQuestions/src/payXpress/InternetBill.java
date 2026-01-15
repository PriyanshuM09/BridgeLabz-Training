package payXpress;

public class InternetBill extends Bill {

    public InternetBill(double amount, String dueDate) {
        super("Internet", amount, dueDate);
    }

    @Override
    public void sendReminder() {
        System.out.println(" Internet service will stop soon! Pay before " + dueDate);
    }
}

