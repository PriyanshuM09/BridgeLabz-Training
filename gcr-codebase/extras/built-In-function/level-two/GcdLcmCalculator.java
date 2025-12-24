// GCD and LCM Calculator:
import java.util.Scanner;
public class GcdLcmCalculator{
 public static int findGCD(int a,int b){
   while(b !=0){
   int temp= b;
    b= a % b;
    a= temp;
       }
   return a;
    }
  public static int findLCM(int a, int b){
    int gcd = findGCD(a, b);
   return (a*b)/gcd;
    }
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
   System.out.println("Enter first number ");
     int num1 = sc.nextInt();
    System.out.println("Enter second number ");
      int num2 = sc.nextInt();

  int gcd = findGCD(num1, num2);
  int lcm = findLCM(num1, num2);

  System.out.println("GCD of the numbers is " + gcd);
  System.out.println("LCM of the numbers is " + lcm);
    }
}
