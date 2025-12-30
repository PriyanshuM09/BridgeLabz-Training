package com.objectmodelling;

public class CustomerC1 {
	 private String customerName;

	    public CustomerC1(String customerName) {
	        this.customerName = customerName;
	    }

	    public void placeOrder(Order order) {
	        System.out.println(customerName + " placed an order.");
	        order.showOrderDetails();
	    }
}
