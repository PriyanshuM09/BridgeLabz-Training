package mybank;

public abstract class Account implements ITransaction {
    protected String accountNumber;  
    private double balance;           

    Account(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0.0;
    }

    Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
        }
    }

    @Override
    public double checkBalance() {
        return balance;
    }

    abstract double calculateInterest();

    // Protected access for subclasses
    protected void addInterest(double interest) {
        balance += interest;
    }
}

