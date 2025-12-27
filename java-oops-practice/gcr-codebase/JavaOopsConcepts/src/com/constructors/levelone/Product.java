package com.constructors.levelone;

public class Product{

    String productName;
    double price;

    // Class Variable (shared)
    static int totalProducts = 0;

    // Parameterized Constructor
    Product(String productName, double price){
        this.productName = productName;
        this.price = price;
        totalProducts++;   
    }
    // Instance Method
    void displayProductDetails(){
        System.out.println("Product Name: " + productName);
        System.out.println("Price   : " + price);
        System.out.println();
    }
    
    static void displayTotalProducts(){
        System.out.println("Total Products Created: " + totalProducts);
    }

}
