package com.encapsulation;

public class LibraryManagementSystem {
    public static void main(String[] args) {

        LibraryItem[] items = new LibraryItem[3];

        items[0] = new Book(101, "Clean Code", "Robert C. Martin");
        items[1] = new Magazine(102, "Tech Today", "Editorial Team");
        items[2] = new DVD(103, "Inception", "Christopher Nolan");

        for (LibraryItem item : items) {

            item.getItemDetails();

            Reservable r = (Reservable) item;
            System.out.println("Available: " + r.checkAvailability());

            r.reserveItem("Student A");
            System.out.println("Available after reservation: " +
                    r.checkAvailability());

            System.out.println();
        }
    }
}

