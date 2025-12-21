// Write a program to take 2 numbers and print their quotient and reminder

import java.util.Scanner;

public class QuotientAndRemainder {
 
 public static int[] findRemainderAndQuotient(int number, int divisor) {
 int quotient = number / divisor;
   int remainder = number % divisor;

 int[] result = new int[2];
  result[0] = quotient;
   result[1] = remainder;
        return result;
    }
	
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

   // Taking input from user
  System.out.print("Enter the number: ");
  int number = sc.nextInt();
  System.out.print("Enter the divisor: ");
   int divisor = sc.nextInt();
   
   int[] output = findRemainderAndQuotient(number, divisor);
		
  System.out.println("Quotient  " + output[0]);
 System.out.println("Remainder  " + output[1]);

    }
}
