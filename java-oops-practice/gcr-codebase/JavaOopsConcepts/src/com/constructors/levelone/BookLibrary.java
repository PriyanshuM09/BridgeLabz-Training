package com.constructors.levelone;

public class BookLibrary{
		  public static void main(String[] args){

		        Book1 b = new Book1("501-A", "Java Basics", "James");
		        System.out.println("Author: " + b.getAuthor());

		        EBook1 eb = new EBook1("601-B", "Advanced Java", "Bloch");
		        eb.displayDetails();
		    }
	}


