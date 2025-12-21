// Write a program to find the sum of n natural numbers using loop
import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static int findSum(int n) {
        int sum = 0;
        for (int i = 1;i <= n;i++) {
            sum =sum + i;
        }
        return sum;
    }
    public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);

    // Taking input from user
    System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

      int result = findSum(n);
       System.out.println("Sum of " + n + " natural numbers is: " + result);

    }
}
