package com.SmartShelf;

public class Main {
    public static void main(String[] args) {

        Book[] readingList = {
            new Book("Data Structures"),
            new Book("Algorithms"),
            new Book("Computer Networks"),
            new Book("Operating Systems"),
            new Book("Artificial Intelligence")
        };

        System.out.println("Before Sorting:");
        SmartShelf.displayShelf(readingList);

        SmartShelf.sortByTitle(readingList);

        System.out.println("\nAfter Sorting (Alphabetical):");
        SmartShelf.displayShelf(readingList);
    }
}
