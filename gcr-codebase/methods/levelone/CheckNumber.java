//Write a program to check whether a number is positive, negative, or zero.

import java.util.*;
public class CheckNumber{

    public static int checkNumber(int number){
	
	      if (number > 0) {
            return 1;
        } else if (number < 0) {
            return -1;
        } else {
            return 0;
        }
	      
	   }
    public static void main(String args[]){
    Scanner sc= new Scanner(System.in);

    //Enter number
    int number=sc.nextInt();
	int result= checkNumber(number);
	
	// print results
	 if(result>0){
		    System.out.println("Number is positive");
		   }
		   else if(result==0){
		   System.out.println("Number is zero");
		   }
		   else{
		    System.out.println("Number is negative");
		   }

 }
 }