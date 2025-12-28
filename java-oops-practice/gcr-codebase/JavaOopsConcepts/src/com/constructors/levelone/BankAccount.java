package com.constructors.levelone;

public class BankAccount{

    public int accountNumber;        
    protected String accountHolder;  
    private double balance;           

    // constructor
    public BankAccount(int accountNumber, String accountHolder, double balance){
        this.accountNumber =accountNumber;
        this.accountHolder =accountHolder;
        this.balance = balance;
    }

    // getter method for balance
    public double getBalance(){
        return balance;
    }

    // setter method to modify balance
    public void setBalance(double balance){
        this.balance = balance;
    }
}
