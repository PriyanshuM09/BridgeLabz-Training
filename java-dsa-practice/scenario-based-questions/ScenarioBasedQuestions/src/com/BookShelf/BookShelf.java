package com.BookShelf;

import java.util.*;

public class BookShelf{

    private HashMap<String, LinkedList<Book>> catalog = new HashMap<>();
    private HashSet<Book> uniqueBooks = new HashSet<>();

    public void addBook(String genre, String title, String author){
        Book book = new Book(title, author);

        if (uniqueBooks.contains(book)){
            System.out.println(" Duplicate book not allowed: " + book);
            return;
        }

        catalog.putIfAbsent(genre, new LinkedList<>());
        catalog.get(genre).add(book);
        uniqueBooks.add(book);

        System.out.println(" Book added: " + book);
    }

    public void removeBook(String genre, String title, String author){
        if (!catalog.containsKey(genre)){
            System.out.println(" Genre not found!");
            return;
        }

        Book book = new Book(title, author);
        LinkedList<Book> list = catalog.get(genre);

        if (list.remove(book)){
            uniqueBooks.remove(book);
            System.out.println(" Book borrowed: " + book);
        } else {
            System.out.println(" Book not found!");
        }
    }

    public void displayCatalog(){
        System.out.println("\n Library Catalog:");
        for (String genre : catalog.keySet()) {
            System.out.println("Genre: " + genre);
            for (Book b : catalog.get(genre)) {
                System.out.println("  - " + b);
            }
        }
    }
}
