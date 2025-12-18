//Create a program to find the multiplication table of a number entered by the user from 6 to 9
import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        // Take input from user
        int number = sc.nextInt();

        // Print multiplication table from 6 to 9
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }
    }
}
