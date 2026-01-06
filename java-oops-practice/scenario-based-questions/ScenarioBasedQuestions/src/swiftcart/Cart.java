package swiftcart;

import java.util.ArrayList;
import java.util.List;

class Cart implements ICheckout {

    private List<Product> products;
    private double totalPrice;

    // Empty cart
    public Cart() {
        products = new ArrayList<>();
    }

    // Cart with pre-selected items
    public Cart(List<Product> products) {
        this.products = products;
        calculateTotal();
    }

    public void addProduct(Product product) {
        products.add(product);
        calculateTotal();
    }

    private void calculateTotal() {
        totalPrice = 0;
        for (Product p : products) {
            totalPrice += p.getTotalPrice();
        }
    }

    @Override
    public void applyDiscount() {
        double totalDiscount = 0;
        for (Product p : products) {
            totalDiscount += p.getDiscount(); 
        }
        totalPrice = totalPrice - totalDiscount;
    }

    @Override
    public void generateBill() {
        applyDiscount();
        System.out.println("------ SwiftCart Bill ------");
        for (Product p : products) {
            System.out.println(p.name + " x" + p.quantity + " = ₹" + p.getTotalPrice());
        }
        System.out.println("Final Amount: ₹" + totalPrice);
    }
}

