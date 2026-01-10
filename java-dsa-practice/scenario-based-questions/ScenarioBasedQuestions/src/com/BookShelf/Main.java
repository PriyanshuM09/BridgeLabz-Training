package com.BookShelf;

public class Main {
    public static void main(String[] args) {

        BookShelf shelf = new BookShelf();

        shelf.addBook("Fiction", "Harry Potter", "J.K. Rowling");
        shelf.addBook("Fiction", "The Hobbit", "J.R.R. Tolkien");
        shelf.addBook("Science", "A Brief History of Time", "Stephen Hawking");

        shelf.addBook("Fiction", "Harry Potter", "J.K. Rowling");

        shelf.displayCatalog();

        shelf.removeBook("Fiction", "Harry Potter", "J.K. Rowling");

        shelf.displayCatalog();
    }
}

