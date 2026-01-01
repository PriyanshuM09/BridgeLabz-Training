package com.inheritance.hierarchicalinheritance;

public class BankSystem {
    public static void main(String[] args) {

        BankAccount a1 = new SavingsAccount(101, 50000, 4.5);
        BankAccount a2 = new CheckingAccount(102, 30000, 20000);
        BankAccount a3 = new FixedDepositAccount(103, 100000, 5);

        a1.displayAccountType();
        a2.displayAccountType();
        a3.displayAccountType();
    }
}

