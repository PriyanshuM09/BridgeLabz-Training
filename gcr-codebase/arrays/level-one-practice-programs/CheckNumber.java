// Write a program to take user input for 5 numbers and check whether a number is positive,  negative, or zero. Further for positive numbers check if the number is even or odd. Finally compare 
// the first and last elements of the array and display if they equal, greater or less

import java.util.Scanner;
public class CheckNumber{
public static void main(String args[]){
Scanner sc= new Scanner(System.in);

// Initializing the numbers array
int num[]= new int[5];

//Taking input from user 
          for(int i=0;i<num.length;i++){
		  num[i]= sc.nextInt();
		  }
		  
// Checking the input number 
          for(int i=0;i<num.length;i++){
		  if(num[i]>=0){
		            if(num[i]%2==0){
					System.out.println("Number "+ num[i]+" is positive and even" );
					}
					else{
					System.out.println("Number "+ num[i]+" is positive and odd" );
					}
		         }
		  else if(num[i]==0){
		            System.out.println("Number is zero");
		         }
		  else{
		           System.out.println("Number "+ num[i]+" is negetive " );
				 }

		  }
		  if(num[0]>num[num.length-1]){
		           System.out.println("the first is greater than the last element");
		      }
		  else if(num[0]==num[num.length-1]){
		         System.out.println("the first and last elements of the array are equal");
		      }else{
			     System.out.println("the last is greater than the first element");
			  }
		  }		  



  }
