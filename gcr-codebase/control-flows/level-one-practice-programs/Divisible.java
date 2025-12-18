// Write a program to check if a number is divisible by 5

import java.util.Scanner;
public class Divisible{
public static void main(String args[]){

    Scanner sc= new Scanner(System.in);

    // Taking input from user
    int number= sc.nextInt();

    // Check weather number is divisible by 5
    if(number%5 ==0){ 
	       System.out.print(" Is the number " + number+" divisible by 5? Yes" );
		             }
    else{
		   System.out.println(" Is the number " + number+" divisible by 5? No");
		}
         }
    }