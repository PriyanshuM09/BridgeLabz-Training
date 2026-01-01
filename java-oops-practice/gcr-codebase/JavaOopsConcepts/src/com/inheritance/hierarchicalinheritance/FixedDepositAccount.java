package com.inheritance.hierarchicalinheritance;

public class FixedDepositAccount extends BankAccount {

    int depositPeriod;  

    FixedDepositAccount(int accountNumber, double balance, int depositPeriod) {
        super(accountNumber, balance);
        this.depositPeriod = depositPeriod;
    }

    @Override
    void displayAccountType() {
        System.out.println("Fixed Deposit Account");
    }
}

