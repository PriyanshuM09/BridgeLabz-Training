package com.RoboWarehouse;

class InsertionSorter {

    public void sort(int[] weights) {

        for (int i = 1; i < weights.length; i++) {

            int newPackage = weights[i];
            int position = i - 1;
            while (position >= 0 && weights[position] > newPackage) {
                weights[position + 1] = weights[position];
                position--;
            }
            weights[position + 1] = newPackage;
        }
    }
}

