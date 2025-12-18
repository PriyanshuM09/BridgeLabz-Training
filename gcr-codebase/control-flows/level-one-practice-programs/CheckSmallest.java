// Write a program to check if the first is the smallest of the 3 numbers.

import java.util.Scanner;
public class CheckSmallest{
public static void main(String args[]){

Scanner sc= new Scanner(System.in);

// Taking input from user
int number1= sc.nextInt();
int number2= sc.nextInt();
int number3= sc.nextInt();

// Checking the smallest number 
if(number1<number2 && number1<number3){
     System.out.println("Is the first number the smallest? Yes");
     }
else{
     System.out.println("Is the first number the smallest? No");
    }	 
 }
}