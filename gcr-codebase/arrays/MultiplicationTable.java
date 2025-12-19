//Create a program to print a multiplication table of a number.
import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Array to store multiplication results from 1 to 10
        int[] table = new int[10];

        // Storing multiplication results in array
        for (int i = 1; i <= 10; i++) {
            table[i - 1] = number * i;
        }

        // Displaying the multiplication table
        System.out.println("Multiplication Table of " + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + table[i - 1]);
        }

       
    }
}
