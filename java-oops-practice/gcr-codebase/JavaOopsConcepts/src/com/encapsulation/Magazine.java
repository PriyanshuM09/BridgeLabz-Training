package com.encapsulation;

public class Magazine extends LibraryItem implements Reservable {

    private boolean available = true;
    private String borrowerName;

    public Magazine(int itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 7;
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

