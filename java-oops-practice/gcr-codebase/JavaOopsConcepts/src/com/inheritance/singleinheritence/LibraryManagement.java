package com.inheritance.singleinheritence;

public class LibraryManagement {
    public static void main(String[] args) {

        Book book = new Author(
                "Clean Code",
                2008,
                "Robert C. Martin",
                "Software engineer and author"
        );

        book.displayInfo();
    }
}

