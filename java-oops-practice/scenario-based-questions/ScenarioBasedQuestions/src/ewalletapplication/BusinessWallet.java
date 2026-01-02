package ewalletapplication;

public class BusinessWallet extends Wallet implements Transferrable {

    public BusinessWallet(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void transferTo(User receiver, double amount) {
        double tax = amount * 0.02;   // 2% transaction tax
        double total = amount + tax;

        if (deductMoney(total)) {
            receiver.getWallet().addMoney(amount);
            System.out.println("Transfer successful (Business Wallet)");
            System.out.println("Tax Deducted: " + tax);
        } else {
            System.out.println("Insufficient balance including tax.");
        }
    }
}

