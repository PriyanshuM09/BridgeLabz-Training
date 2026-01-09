package foodloop;

import java.util.ArrayList;

public class Order implements IOrderable {

    private ArrayList<FoodItem> items;
    private double total;

    public Order() {
        items = new ArrayList<>();
        total = 0;
    }

    public void addItem(FoodItem item) {
        if (item.isAvailable()) {
            items.add(item);
            total += item.getPrice();
            item.reduceStock();
        } else {
            System.out.println(item.getName() + " is out of stock!");
        }
    }

    @Override
    public void placeOrder() {
        if (items.isEmpty()) {
            System.out.println("No items in order.");
            return;
        }

        double finalTotal = items.get(0).applyDiscount(total);

        System.out.println("Order placed!");
        System.out.println("Total Bill: ₹" + finalTotal);
    }

    @Override
    public void cancelOrder() {
        items.clear();
        total = 0;
        System.out.println("Order cancelled.");
    }
}
