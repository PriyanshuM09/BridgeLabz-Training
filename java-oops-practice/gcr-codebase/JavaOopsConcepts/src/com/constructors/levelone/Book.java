package com.constructors.levelone;

public class Book {
	   String title;
	    String author;
	    double price;

	    // Default Constructor
	    Book() {
	        title = "Not Available";
	        author = "Unknown";
	        price = 0.0;
	    }

	    // Parameterized Constructor
	    Book(String title, String author, double price) {
	        this.title = title;
	        this.author = author;
	        this.price = price;
	    }

	    void displayDetails() {
	        System.out.println("Title: " + title);
	        System.out.println("Author: " + author);
	        System.out.println("Price: ₹" + price);
	        System.out.println();
	    }

	    public static void main(String[] args) {

	        // Using Default Constructor
	        Book book1 = new Book();
	        book1.displayDetails();

	        // Using Parameterized Constructor
	        Book book2 = new Book("Clean Code", "Robert C. Martin", 450);
	        book2.displayDetails();
	    }
}
