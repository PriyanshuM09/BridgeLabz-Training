// Write a program to store multiple values in an array up to a maximum of 10 or until the user enters a 0 or a negative number. 
// Show all the numbers as well as the sum of all numbers 

import java.util.Scanner;

public class ArraySum {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        // Initializing the array of size 10
        double num[] = new double[10];

        // Variable to store total
        double total = 0.0;

        // Index for array
        int index = 0;

        System.out.println("Enter numbers (0 or negative to stop):");

        // Infinite while loop
        while (true) {

            // Check array limit
            if (index == 10) {
                System.out.println("Maximum limit of 10 numbers reached.");
                break;
            }

            // Take user input
            double input = sc.nextDouble();

            // Break if input is 0 or negative
            if (input <= 0) {
                break;
            }

            // Store value in array
            num[index] = input;
            index++;
        }

        // Display all numbers and calculate sum
        System.out.println("Entered numbers are:");
        for (int i = 0; i < index; i++) {
            System.out.println(num[i]);
            total = total + num[i];
        }

        // Display total
        System.out.println("Sum of all numbers : " + total);
    }
}
