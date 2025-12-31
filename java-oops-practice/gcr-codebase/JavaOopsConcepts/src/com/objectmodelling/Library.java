package com.objectmodelling;
import java.util.ArrayList;

public class Library {
	 private String libraryName;
	    private ArrayList<Book> books;

	    public Library(String libraryName) {
	        this.libraryName = libraryName;
	        this.books = new ArrayList<>();
	    }

	    public void addBook(Book book) {
	        books.add(book) ;
	    }

	    public void showBooks() {
	        System.out.println("Books in " + libraryName + ":");
	        for (Book b : books) {
	            b.showBookDetails();
	        }
	    }
}
