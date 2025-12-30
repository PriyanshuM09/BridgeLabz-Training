package com.objectmodelling;

public class LibraryManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   // Creating independent Book objects
        Book b1 = new Book("Java Programming", "James Gosling");
        Book b2 = new Book("Clean Code", "Robert C. Martin");

        // Creating Library objects
        Library lib1 = new Library("City Library");
        Library lib2 = new Library("College Library");

        // Aggregation: adding books to libraries
        lib1.addBook(b1);
        lib1.addBook(b2);

        lib2.addBook(b1); // Same book added to another library

        // Display books
        lib1.showBooks();
        System.out.println();
        lib2.showBooks();
	}

}
