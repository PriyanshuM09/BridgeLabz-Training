// Create a program to print odd and even numbers between 1 to the number entered by the user.

import java.util.Scanner;

public class PrintOddEven{
public static void main(String args[]){

  Scanner sc= new Scanner(System.in);
  
      // Taking input from user
       int number= sc.nextInt();
	   
	   // print odd and even using loop
	   for(int i=1;i<=number;i++){
	   if(i%2==0){
	               System.out.println("Even number : "+i+" ");
	            }
	    else{ 
		      System.out.println("Odd number : "+i+" ");
		     }
	   }
	   
    }
 }