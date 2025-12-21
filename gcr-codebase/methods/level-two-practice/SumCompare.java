// Write a program to find the sum of n natural numbers using recursive method and compare the result with the formulae n*(n+1)/2
// and show the result from both computations is correct.

import java.util.Scanner;
public class SumCompare{

   public static int sumByRecursion(int n) {
     if (n == 1) {
          return 1;
        }
      return n + sumByRecursion(n - 1);
    }
	
  public static int sumByFormula(int n) {
    return n * (n + 1) / 2;
    }

        public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

         System.out.print("Enter a number: ");
        int n = sc.nextInt();

          if (n <= 0){
                System.out.println("Enter a natural number only");
              } 
		else{
   int recSum = sumByRecursion(n);
     int formSum = sumByFormula(n);

     System.out.println("Sum using recursion: " + recSum);
       System.out.println("Sum using formula: " + formSum);
	 if (recSum == formSum) {
                System.out.println("Both results are correct and equal");
                     } 
	         else {
                System.out.println("Results are not equal");
                   }
   }
    }
}
