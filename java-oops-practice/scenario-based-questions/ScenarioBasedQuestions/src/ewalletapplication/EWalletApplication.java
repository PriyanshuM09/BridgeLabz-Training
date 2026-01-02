package ewalletapplication;

public class EWalletApplication {
    public static void main(String[] args) {

        User user1 = new User(
                "Priyanshu",
                new PersonalWallet(5000, true)
        );

        User user2 = new User(
                "Amit",
                new BusinessWallet(20000)
        );

        System.out.println("Initial Balance (Priyanshu): " +
                user1.getWallet().getBalance());
        System.out.println("Initial Balance (Amit): " +
                user2.getWallet().getBalance());

        ((Transferrable) user1.getWallet()).transferTo(user2, 3000);

        System.out.println("\nAfter Transfer:");
        System.out.println("Priyanshu Balance: " +
                user1.getWallet().getBalance());
        System.out.println("Amit Balance: " +
                user2.getWallet().getBalance());

        System.out.println("\nTransaction History (Priyanshu):");
        user1.getWallet().showTransactions();
    }
}

