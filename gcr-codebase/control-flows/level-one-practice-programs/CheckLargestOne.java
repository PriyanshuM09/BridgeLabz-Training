// Write a program to check if the first, second, or third number is the largest of the three.
import java.util.Scanner;
public class CheckLargestOne{
public static void main(String args[]){

Scanner sc= new Scanner(System.in);
  // Taking input from user
        int number1= sc.nextInt();
        int number2= sc.nextInt();
        int number3= sc.nextInt();

 // checking largest
        boolean firstLargest = (number1 > number2) && (number1 > number3);
        boolean secondLargest = (number2 > number1) && (number2 > number3);
        boolean thirdLargest = (number3 > number1) && (number3 > number2);

  // output
        System.out.println("Is the first number the largest? " + firstLargest);
        System.out.println("Is the second number the largest? " + secondLargest);
        System.out.println("Is the third number the largest? " + thirdLargest);
 }
}