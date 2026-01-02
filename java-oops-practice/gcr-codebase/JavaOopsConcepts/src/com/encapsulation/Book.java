package com.encapsulation;

public class Book extends LibraryItem implements Reservable {

    private boolean available = true;
    private String borrowerName; 

    public Book(int itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 14;
    }

    @Override
    public void reserveItem(String borrowerName) {
        if (available) {
            this.borrowerName = borrowerName;
            available = false;
        }
    }

    @Override
    public boolean checkAvailability() {
        return available;
    }
}
