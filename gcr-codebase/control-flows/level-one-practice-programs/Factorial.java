// Write a Program to find the factorial of an integer entered by the user.

import java.util.Scanner;
public class Factorial{
public static void main(String args[]){
 Scanner sc= new Scanner(System.in);
 
 // Taking input from user
 int number= sc.nextInt();
 
 // Evaluating the factorialof number
 if(number>0){
       int i=1;
	   int sum=1;
	   
	   while(i<=number){
	                     sum=sum*i;
			              i++;
	                  }
		System.out.println("Factorial of "+number+" is "+ sum)	;  
	   
            }
  else{System.out.println("number is not a positive");}			
 }
}