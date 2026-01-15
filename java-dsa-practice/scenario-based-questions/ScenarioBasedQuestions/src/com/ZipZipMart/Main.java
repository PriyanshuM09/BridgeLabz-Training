package com.ZipZipMart;

public class Main {
    public static void main(String[] args) {

        SalesRecord[] sales = {
            new SalesRecord("2026-01-10", 1200),
            new SalesRecord("2026-01-08", 500),
            new SalesRecord("2026-01-10", 800),
            new SalesRecord("2026-01-09", 1500),
            new SalesRecord("2026-01-08", 300)
        };

        System.out.println("Before Sorting:");
        ZipZipMartSorter.display(sales);

        ZipZipMartSorter.mergeSort(sales, 0, sales.length - 1);

        System.out.println("\nAfter Sorting (By Date & Amount):");
        ZipZipMartSorter.display(sales);
    }
}

