// Factorial Using Recursion:

import java.util.Scanner;
public class FactorialRecursion{

  public static int factorial(int num){
   if(num==0 ||num == 1){
            return 1;
        }
  return num*factorial(num - 1);
    }
 public static void main(String args[]) {
   Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        int result = factorial(num);

  System.out.println("Factorial of " + num + " is: " + result);
    }
}
