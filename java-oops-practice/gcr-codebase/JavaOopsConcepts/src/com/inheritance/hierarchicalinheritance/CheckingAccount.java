package com.inheritance.hierarchicalinheritance;

public class CheckingAccount extends BankAccount {

    double withdrawalLimit;

    CheckingAccount(int accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    @Override
    void displayAccountType() {
        System.out.println("Checking Account");
    }
}

