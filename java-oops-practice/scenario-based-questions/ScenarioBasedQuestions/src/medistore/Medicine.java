package medistore;

import java.time.LocalDate;

public class Medicine implements ISellable {

    private String name;
    private double price;
    private LocalDate expiryDate;
    private int quantity;

    public Medicine(String name, double price, LocalDate expiryDate) {
        this.name = name;
        this.price = price;
        this.expiryDate = expiryDate;
        this.quantity = 50; 
    }

    
    private double calculateTotal(int qty) {
        return price * qty;
    }

 
    public void addStock(int qty){
        quantity += qty;
    }

    public void reduceStock(int qty){
        quantity -= qty;
    }

    @Override
    public void sell(int qty) {
        if (qty <= quantity) {
            double total = calculateTotal(qty);
            System.out.println("Sold " + qty + " units of " + name);
            System.out.println("Total Price: " + total);
            reduceStock(qty);
        } else {
            System.out.println("Insufficient stock!");
        }
    }

    @Override
    public void checkExpiry() {
        if (expiryDate.isBefore(LocalDate.now())) {
            System.out.println(name + " is EXPIRED!");
        } else {
            System.out.println(name + " is safe to use.");
        }
    }
    public int getQuantity() {
        return quantity;
    }
}

