package com.RoboWarehouse;

class ShelfDisplay {

    public void show(int[] weights) {
        for (int w : weights) {
            System.out.print(w + " ");
        }
        System.out.println();
    }
}
