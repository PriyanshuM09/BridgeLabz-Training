package com.constructors.levelone;

public class EBook1 extends Book1{
	   EBook1(String ISBN, String title, String author){
	        super(ISBN, title, author);
	    }
	    public void displayDetails(){
	        System.out.println("ISBN: " + ISBN);     
	        System.out.println("Title: " + title); 
	    }
}
