package ewalletapplication;

import java.util.ArrayList;

public class Wallet {

    private double balance;   // encapsulated
    protected ArrayList<Transaction> transactions = new ArrayList<>();

    public Wallet(double initialBalance) {
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    protected void addMoney(double amount) {
        balance += amount;
        transactions.add(new Transaction("Money Added", amount));
    }

    protected boolean deductMoney(double amount) {
        if (amount <= balance) {
            balance -= amount;
            transactions.add(new Transaction("Money Deducted", amount));
            return true;
        }
        return false;
    }

    public void showTransactions() {
        for (Transaction t : transactions) {
            System.out.println(t.getTransactionDetails());
        }
    }
}
