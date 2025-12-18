// Write a program to check for the natural number and write the sum of n natural numbers

import java.util.Scanner;
public class NaturalNumber{
public static void main(String args[]){
 
  Scanner sc= new Scanner(System.in);
   // taking input from user
   int number= sc.nextInt();
   
   int sum= number * ( number + 1 ) / 2 ;

   
   // Checking weather number is positive
   if(number >0){
       System.out.println(" The sum of " + number+" natural numbers is "+sum);
                }
   else	{
        System.out.println("The number "+number+" is not a natural number");
        }		
  }
}