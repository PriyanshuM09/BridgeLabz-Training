package com.objectmodelling;

public class ECommercePlatform {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        CustomerC1 customer = new CustomerC1("Rahul");

        Product p1 = new Product("Laptop", 60000);
        Product p2 = new Product("Mouse", 800);
        Product p3 = new Product("Keyboard", 1500);

        Order order = new Order(101);
        order.addProduct(p1);
        order.addProduct(p2);
        order.addProduct(p3);

        customer.placeOrder(order);
	}

}
