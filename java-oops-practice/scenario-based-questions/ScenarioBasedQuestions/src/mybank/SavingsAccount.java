package mybank;

public class SavingsAccount extends Account {

    private static final double INTEREST_RATE = 4.0;

    SavingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    double calculateInterest() {
        double interest = checkBalance() * INTEREST_RATE / 100; 
        addInterest(interest);
        return interest;
    }
}

