// Write a program to input the Principal, Rate, and Time values and calculate Simple Interest.
import java.util.*;

public class CalculateSimpleInterest{

              // created a method to calculate simple interest
               public static int  calcSimpleInterest(int principal, int time, int rate){
                           int calculate= (principal* rate* time)/100;
                           return calculate;
                                }
  
 public static void main(String args[]){
                  Scanner sc= new Scanner(System.in);
				  
			// Taking input from user 
                  int principal=sc.nextInt();
                  int rate= sc.nextInt();
                  int time=sc.nextInt();
  
            int simpleIntrest= calcSimpleInterest(principal,time,rate);
  
  System.out.println(" Simple Intrest is : "+ simpleIntrest);
  }
}