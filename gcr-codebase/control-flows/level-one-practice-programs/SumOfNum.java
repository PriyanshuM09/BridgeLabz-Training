// Write a program to find the sum of numbers until the user enters 0
import java.util.Scanner;

public class SumOfNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // initialize sum
        double total = 0.0;   
        double number;        
        // variable to store user input
        System.out.println("Enter numbers to add :");

        // first input
        number = scanner.nextDouble();

        // loop until user enters 0
        while (number != 0) {
            total += number;  // add to total
            System.out.println("Current total: " + total);
            System.out.print("Enter another number : ");
            number = scanner.nextDouble();  // ask again
        }

        // display final result
        System.out.println("Final total sum = " + total);
        
    }
}