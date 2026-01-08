package com.sortingalgorithms;

public class InsertionSort {

    public static void main(String[] args) {

        int[] empIds = {105, 102, 109, 101, 104};
        int n = empIds.length;

        for (int i = 1; i < n; i++) {
            int key = empIds[i];
            int j = i - 1;

            while (j >= 0 && empIds[j] > key) {
                empIds[j + 1] = empIds[j];
                j--;
            }

            empIds[j + 1] = key;
        }

        // Print sorted employee IDs
        System.out.println("Sorted Employee IDs:");
        for (int id : empIds) {
            System.out.print(id + " ");
        }
    }
}
