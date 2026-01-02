package com.encapsulation;

public class ECommercePlatform {

    public static void main(String[] args) {

        Product[] products = new Product[3];

        products[0] = new Electronics(101, "Laptop", 60000);
        products[1] = new Clothing(102, "T-Shirt", 2000);
        products[2] = new Groceries(103, "Rice Bag", 1200);

        for (Product p : products) {
            printFinalPrice(p);
            System.out.println();
        }
    }

    // Polymorphic method
    public static void printFinalPrice(Product product) {

        double price = product.getPrice();
        double discount = product.calculateDiscount();
        double tax = 0;

        if (product instanceof Taxable) {
            tax = ((Taxable) product).calculateTax();
            System.out.println(((Taxable) product).getTaxDetails());
        } else {
            System.out.println("No tax applicable");
        }

        double finalPrice = price + tax - discount;

        System.out.println("Product: " + product.getName());
        System.out.println("Base Price: " + price);
        System.out.println("Discount: " + discount);
        System.out.println("Tax: " + tax);
        System.out.println("Final Price: " + finalPrice);
    }
}

