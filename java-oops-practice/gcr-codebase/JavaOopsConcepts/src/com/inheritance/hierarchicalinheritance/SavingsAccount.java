package com.inheritance.hierarchicalinheritance;

public class SavingsAccount extends BankAccount {

    double interestRate;

    SavingsAccount(int accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    @Override
    void displayAccountType() {
        System.out.println("Savings Account");
    }
}

