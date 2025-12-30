package com.objectmodelling;

public class Product {
	   private String productName;
	    private double price;

	    public Product(String productName, double price) {
	        this.productName = productName;
	        this.price = price;
	    }

	    public double getPrice() {
	        return price;
	    }

	    public void showProduct() {
	        System.out.println("Product: " + productName + ", Price: " + price);
	    }
}
