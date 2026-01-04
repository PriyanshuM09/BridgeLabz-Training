package mybank;

public class MyBankApp {
    public static void main(String[] args) {

        Account savings = new SavingsAccount("SB101", 10000);
        Account current = new CurrentAccount("CA202");

        savings.deposit(2000);
        savings.calculateInterest();

        current.deposit(5000);
        current.calculateInterest();

        System.out.println("Savings Balance: ₹" + savings.checkBalance());
        System.out.println("Current Balance: ₹" + current.checkBalance());
    }
}

