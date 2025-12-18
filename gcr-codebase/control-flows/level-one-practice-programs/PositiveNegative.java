//Write a program to check whether a number is positive, negative, or zero.

import java.util.Scanner;
public class PositiveNegative{
    public static void main(String[]args){
	
	Scanner sc=new Scanner(System.in);
	int number=sc.nextInt();
	
	//check whether the number is positive,negative or zero
    if(number==0){
    System.out.println("zero");
    }
     else if(number<0){
	 System.out.println("Negative");
	}
	else{
	System.out.println("Positive");
	}
	
	}
}	