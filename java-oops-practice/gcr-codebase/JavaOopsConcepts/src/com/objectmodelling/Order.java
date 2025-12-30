package com.objectmodelling;
import java.util.*;
public class Order {
	 private int orderId;
	    private ArrayList<Product> products;

	    public Order(int orderId) {
	        this.orderId = orderId;
	        products = new ArrayList<>();
	    }

	    public void addProduct(Product product) {
	        products.add(product);
	    }

	    public void showOrderDetails() {
	        System.out.println("Order ID: " + orderId);
	        double total = 0;

	        for (Product p : products) {
	            p.showProduct();
	            total += p.getPrice();
	        }

	        System.out.println("Total Amount: " + total);
	    }
}
