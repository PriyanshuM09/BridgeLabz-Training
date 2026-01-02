package com.encapsulation;

public class SavingsAccount extends BankAccount implements Loanable {

    private double interestRate;

    public SavingsAccount(int accountNumber, String holderName,
                          double balance, double interestRate) {
        super(accountNumber, holderName, balance);
        this.interestRate = interestRate;
    }

    @Override
    public double calculateInterest() {
        return getBalance() * interestRate / 100;
    }

    @Override
    public void applyForLoan(double amount) {
        System.out.println("Savings Account loan applied for amount: " + amount);
    }

    @Override
    public boolean calculateLoanEligibility() {
        return getBalance() >= 50000;
    }
}

