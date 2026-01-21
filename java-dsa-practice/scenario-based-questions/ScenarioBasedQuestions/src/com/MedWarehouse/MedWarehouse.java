package com.MedWarehouse;

public class MedWarehouse {

    public static void main(String[] args) {
        Medicine[] medicines = {
            new Medicine("Paracetamol", 20260210),
            new Medicine("Cough Syrup", 20250120),
            new Medicine("Insulin", 20250315),
            new Medicine("Vitamin D", 20251201)
        };
        System.out.println("Before Sorting:");
        for (Medicine m : medicines) {
            System.out.println(m);
        }

        MergeSorter.mergeSort(medicines, 0, medicines.length - 1);

        System.out.println("\nAfter Sorting by Expiry:");
        for (Medicine m : medicines) {
            System.out.println(m);
        }
    }
}
