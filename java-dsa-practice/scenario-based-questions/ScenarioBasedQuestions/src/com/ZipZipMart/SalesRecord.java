package com.ZipZipMart;

public class SalesRecord {
    String date;     
    double amount;

    public SalesRecord(String date, double amount) {
        this.date = date;
        this.amount = amount;
    }

    public void display() {
        System.out.println(date + " | " + amount);
    }
}

