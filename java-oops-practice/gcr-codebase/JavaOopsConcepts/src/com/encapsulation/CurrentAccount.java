package com.encapsulation;

public class CurrentAccount extends BankAccount implements Loanable {

    public CurrentAccount(int accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * 0.02; // 2% interest
    }

    @Override
    public void applyForLoan(double amount) {
        System.out.println("Current Account loan applied for amount: " + amount);
    }

    @Override
    public boolean calculateLoanEligibility() {
        return getBalance() >= 100000;
    }
}

