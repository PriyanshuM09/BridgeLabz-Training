package payXpress;

public class Bill implements IPayable {
    protected String type;
    protected double amount;
    protected String dueDate;

    private boolean isPaid;  

    public Bill(String type, double amount, String dueDate) {
        this.type = type;
        this.amount = amount;
        this.dueDate = dueDate;
        this.isPaid = false;
    }

    protected void markAsPaid() {
        this.isPaid = true;
    }

    public boolean getPaymentStatus() {
        return isPaid;
    }

    public double calculateLateFee(double penalty) {
        return amount + penalty;
    }

    @Override
    public void pay() {
        markAsPaid();
        System.out.println(type + " bill paid successfully.");
    }

    @Override
    public void sendReminder() {
        System.out.println("Reminder: Your " + type + " bill is due on " + dueDate);
    }
}

