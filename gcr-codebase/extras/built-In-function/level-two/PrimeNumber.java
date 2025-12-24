//  Prime Number Checker:Create a program that checks whether a given number is a prime number.  The program should use a separate function to perform the prime check and return the result. 

import java.util.Scanner;
public class PrimeNumber{
public static boolean isPrime(int num){
   if(num<=1){
     return false;}
	 
	 for(int i=2;i<num/2;i++){
	 if(num%i==0){
	 return false;
	 }
	 }
  return true;
 }
public static void main(String args[]){
Scanner sc= new Scanner(System.in);
 System.out.println(" enter your number : ");
int num= sc.nextInt();
boolean results= isPrime(num); 
if(results){
    System.out.println(" your number is prime number");}
 
 else{
 System.out.println(" your number is not a prime number");
     }
}}
