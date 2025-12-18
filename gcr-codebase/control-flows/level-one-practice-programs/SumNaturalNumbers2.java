// Rewrite the program number 12 with the for loop instead of a while loop to find the sum of n Natural Numbers.
import java.util.Scanner;

public class SumNaturalNumbers2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        // calculation by formula
        int sumFormula = 0;
        if (n > 0) {
            sumFormula = n * (n + 1) / 2;
        }

        // calculation by for loop
        int sumFor = 0;
        for (int i = 1; i <= n; i++) {
            sumFor += i;
        }

        // output
        System.out.println("Sum using formula: " + sumFormula);
        System.out.println("Sum using for loop: " + sumFor);

        if (sumFormula == sumFor) {
            System.out.println("Both results match");
        } else {
            System.out.println("Results do not match");
        }
    }
}