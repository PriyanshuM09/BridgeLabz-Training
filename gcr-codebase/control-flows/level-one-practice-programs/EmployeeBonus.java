// Create a program to find the bonus of employees based on their years of service.
import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        // Taking input from user
        double salary = sc.nextDouble();
        int yearsOfService = sc.nextInt();

        double bonus = 0;

        // Checking eligibility for bonus
        if (yearsOfService > 5) {
            bonus = salary * 0.05;
        }

        // Printing bonus amount
        System.out.println("The bonus amount is: " + bonus);
    }
}