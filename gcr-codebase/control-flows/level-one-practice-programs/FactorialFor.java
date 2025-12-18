// Write a Program to find the factorial of an integer entered by the user.
import java.util.Scanner;

class FactorialFor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int num = sc.nextInt();

        // checking for natural number
        if (num <= 0) {
            System.out.println("Please enter a natural number.");
        } else {
            int fact = 1;

            // for loop to calculate factorial
            for (int i = 1; i <= num; i++) {
                fact = fact * i;
            }

            System.out.println("Factorial of " + num + " is " + fact);
        }
    }
}
