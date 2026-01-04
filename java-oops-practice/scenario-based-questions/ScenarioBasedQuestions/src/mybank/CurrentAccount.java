package mybank;

public class CurrentAccount extends Account {

    private static final double INTEREST_RATE = 1.5;

    CurrentAccount(String accountNumber) {
        super(accountNumber);
    }

    @Override
    double calculateInterest() {
        double interest = checkBalance() * INTEREST_RATE / 100;
        addInterest(interest);
        return interest;
    }
}

