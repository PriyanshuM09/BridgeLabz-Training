// Create a program to find the multiplication table of a number entered by the user from 6 to 9 and display the result

import java.util.Scanner;

public class ArrayTable {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        // Taking integer input from user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Array to store multiplication results
        int multiplicationResult[] = new int[10];

        // Using for loop to calculate table from 6 to 9
        for (int i = 6; i <= 9; i++) {
            multiplicationResult[i] = number * i;
        }

        // Displaying the result
        System.out.println("Multiplication Table:");
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + multiplicationResult[i]);
        }
    }
}
