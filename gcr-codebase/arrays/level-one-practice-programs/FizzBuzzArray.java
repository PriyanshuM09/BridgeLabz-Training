//Write a program FizzBuzz, take a number as user input and if it is a positive integer loop from 0 to the number and save the number, but for multiples of 3 save "Fizz" instead of the number, for multiples of 5 save "Buzz", and for multiples of both save "FizzBuzz". Finally, print the array results for each index position in the format Position 1 = 1, …, Position 3 = Fizz,...

import java.util.Scanner;

class FizzBuzzArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Check for positive integer
        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        // Create String array
        String[] result = new String[number + 1];

        // Store FizzBuzz results
        for (int i = 0; i <= number; i++) {

            if (i == 0) {
                result[i] = "0";
            } 
            else if (i % 3 == 0 && i % 5 == 0) {
                result[i] = "FizzBuzz";
            } 
            else if (i % 3 == 0) {
                result[i] = "Fizz";
            } 
            else if (i % 5 == 0) {
                result[i] = "Buzz";
            } 
            else {
                result[i] = String.valueOf(i);
            }
        }

        // Display results
        for (int i = 0; i <= number; i++) {
            System.out.println("Position " + i + " = " + result[i]);
        }
    }
}
