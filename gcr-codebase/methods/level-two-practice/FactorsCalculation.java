// Create a program to find the factors of a number taken as user input, store the factors in an array, and display the factors. Also find the sum,
 // sum of square of factors and product of the factors and display the results
import java.util.Scanner;

public class FactorsCalculation{
    public static int[] findFactors(int number){
          int count = 0;

        //  count number of factors
   for(int i = 1;i <= number; i++){
       if(number % i == 0) {
                count++;
            }
       }
 // Initialize array 
      int[] factors = new int[count];
        int index = 0;

   // Second loop to store factors in array
  for(int i = 1; i <= number; i++) {
       if (number % i == 0) {
           factors[index] = i;
             index++;
            }
        }
        return factors;
       }
    // Method to find sum of factors
  public static int findSum(int[] factors){
          int sum = 0;
            for(int i = 0; i < factors.length; i++){
                  sum = sum + factors[i];
        }
        return sum;
    }
    // find product of factors
    public static long findProduct(int[] factors){
             long product = 1;

        for(int i = 0; i < factors.length; i++){
          product = product * factors[i];
        }
        return product;
    }

   // find sum of squares of factors
   public static double findSumOfSquares(int factors[]){
     double sumOfSquares = 0;
        for(int i = 0; i < factors.length; i++){
          sumOfSquares = sumOfSquares + Math.pow(factors[i], 2);
        }
        return sumOfSquares;
    }

   public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);

      // Taking input from user
    System.out.print("Enter a number: ");
     int number = sc.nextInt();

     // Finding factors
     int[] factors = findFactors(number);
  System.out.println("Factors of " + number + " are:");
        for (int i= 0; i< factors.length; i++) {
            System.out.print(factors[i] + " ");
        }

  System.out.println();
    int sum = findSum(factors);
   long product = findProduct(factors);
      double sumOfSquares = findSumOfSquares(factors);

  System.out.println("Sum of factors: " + sum);
   System.out.println("Product of factors: " + product);
  System.out.println("Sum of squares of factors: " + sumOfSquares);

    }
}
