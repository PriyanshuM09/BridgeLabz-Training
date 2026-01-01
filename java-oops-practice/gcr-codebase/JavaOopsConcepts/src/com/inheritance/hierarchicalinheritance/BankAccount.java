package com.inheritance.hierarchicalinheritance;

public class BankAccount {

    int accountNumber;
    double balance;

    BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void displayAccountType() {
        System.out.println("Generic Bank Account");
    }
}

