// Basic Calculator:
import java.util.Scanner;
public class BasicCalculator{
  public static double add(double a,double b){
        return a+b;
    }
  public static double subtract(double a, double b) {
        return a-b;
    }
 public static double multiply(double a, double b) {
   return a*b;
    }
 public static double divide(double a, double b) {
     return a/b;
    }

 public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

     System.out.println("Enter first number:");
      double num1 = sc.nextDouble();

  System.out.println("Enter second number:");
    double num2 = sc.nextDouble();

   System.out.println("Choose operation:");
   System.out.println("1. Addition");
   System.out.println("2. Subtraction");
  System.out.println("3. Multiplication");
  System.out.println("4. Division");
 int choice = sc.nextInt();

   if(choice == 1){
    System.out.println("Result: "+add(num1, num2));
       }
    else if(choice == 2){
   System.out.println("Result: "+ subtract(num1, num2));
        }
   else if(choice == 3){
     System.out.println("Result: " + multiply(num1, num2));
        }
   else if(choice == 4){
    System.out.println("Result: " + divide(num1, num2));
        }
    else {
     System.out.println("Invalid choice");
       }  
	 }
    }  
