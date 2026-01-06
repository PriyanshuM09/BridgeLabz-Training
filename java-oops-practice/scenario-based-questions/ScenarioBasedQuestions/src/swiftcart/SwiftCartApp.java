package swiftcart;

public class SwiftCartApp {
    public static void main(String[] args) {

        Cart cart = new Cart();

        cart.addProduct(new PerishableProduct("Milk", 50, 2));
        cart.addProduct(new NonPerishableProduct("Rice", 60, 5));

        cart.generateBill();
    }
}

