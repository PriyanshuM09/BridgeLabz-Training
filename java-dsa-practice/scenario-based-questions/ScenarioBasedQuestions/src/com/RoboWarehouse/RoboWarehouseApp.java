package com.RoboWarehouse;

class RoboWarehouseApp {

    public static void main(String[] args) {

        int[] packageWeights = {30, 10, 40, 20, 50};

        PackageShelf shelf = new PackageShelf(packageWeights);
        InsertionSorter robotSorter = new InsertionSorter();
        ShelfDisplay display = new ShelfDisplay();

        System.out.println("Before Loading:");
        display.show(shelf.getWeights());

        robotSorter.sort(shelf.getWeights());

        System.out.println("After Loading (Sorted Shelf):");
        display.show(shelf.getWeights());
    }
}
