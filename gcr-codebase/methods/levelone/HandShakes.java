// Create a program to find the maximum number of handshakes among students.

import java.util.*;

public class HandShakes{

   public static int handShakes(int n){
   
   int combination=(n * (n - 1)) / 2;
   
   return combination;
   
   }
public static void main(String args[]){
      Scanner sc= new Scanner(System.in);
	  
	  //Input number of students
	  System.out.println(" Enter number of students");
	  int n= sc.nextInt();
	  int totHandShake= handShakes(n);
	  
	  System.out.println("Total Handshakes are : "+ totHandShake);
}
}