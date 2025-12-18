// Write a program to find the sum of n natural numbers using while loop compare the result with the formulae n*(n+1)/2 and show the result from both computations was correct
import java.util.Scanner;

public class SumNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		// Take input from user
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        // Checking its natural number or not
        if (n > 0) {
            int sumLoop = 0, i = 1;
            while (i <= n) {
                sumLoop += i;
                i++;
            }

            int sumFormula = n * (n + 1) / 2;

            System.out.println("Sum using while loop = " + sumLoop);
            System.out.println("Sum using formula   = " + sumFormula);

            if (sumLoop == sumFormula){
                System.out.println("Both computations are correct.");
				               }
            else{
                System.out.println("Results do not match.");
                }
       
    }
}