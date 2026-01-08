package com.sortingalgorithms;

public class BubbleSort {

    public static void main(String[] args) {
        int[] marks = {78, 45, 90, 62, 88};
        int n = marks.length;

        // Bubble Sort logic
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (marks[j] > marks[j + 1]) {
                    // swap
                    int temp = marks[j];
                    marks[j] = marks[j + 1];
                    marks[j + 1] = temp;
                }
            }
        }
        System.out.println("Sorted Student Marks:");
        for (int mark : marks) {
            System.out.print(mark + " ");
        }
    }
}

