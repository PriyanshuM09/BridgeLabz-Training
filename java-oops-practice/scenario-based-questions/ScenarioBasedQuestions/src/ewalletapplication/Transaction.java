package ewalletapplication;

public class Transaction {

    private String description;
    private double amount;

    public Transaction(String description, double amount) {
        this.description = description;
        this.amount = amount;
    }

    public String getTransactionDetails() {
        return description + " : " + amount;
    }
}
