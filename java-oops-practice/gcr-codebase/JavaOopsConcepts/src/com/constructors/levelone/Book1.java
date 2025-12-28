package com.constructors.levelone;

public class Book1{
	 public String ISBN;        
	    protected String title;   
	    private String author;     

	    // constructor
	    Book1(String ISBN, String title, String author){
	        this.ISBN = ISBN;
	        this.title = title;
	        this.author = author;
	    }

	    // setter method for author
	    public void setAuthor(String author){
	        this.author = author;
	    }

	    // getter method for author
	    public String getAuthor(){
	        return author;
	    }
}
