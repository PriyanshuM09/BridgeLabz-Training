package ewalletapplication;

public class PersonalWallet extends Wallet implements Transferrable {

    private static final double DAILY_LIMIT = 10000;

    public PersonalWallet(double initialBalance, boolean referral) {
        super(initialBalance);
        if (referral) {
            addMoney(500); // referral bonus
        }
    }

    @Override
    public void transferTo(User receiver, double amount) {
        if (amount > DAILY_LIMIT) {
            System.out.println("Transfer exceeds personal wallet limit.");
            return;
        }

        if (deductMoney(amount)) {
            receiver.getWallet().addMoney(amount);
            System.out.println("Transfer successful (Personal Wallet)");
        } else {
            System.out.println("Insufficient balance.");
        }
    }
}

