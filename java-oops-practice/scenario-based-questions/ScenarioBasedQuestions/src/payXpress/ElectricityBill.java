package payXpress;

public class ElectricityBill extends Bill {

    public ElectricityBill(double amount, String dueDate) {
        super("Electricity", amount, dueDate);
    }
    @Override
    public void sendReminder() {
        System.out.println(" Electricity bill due! Avoid power disconnection. Pay before " + dueDate);
    }
}

