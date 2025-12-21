// An athlete runs in a triangular park with sides provided as input by the user in meters. If the athlete wants to complete a 5 km run, then how many rounds must the athlete complete

import java.util.*;
public class TriangularPark{

    public static int numOfRounds(int side1, int side2, int side3){
	int perimeter= side1+side2+side3;
	
	
	int totatDistance= 5;
	int rounds= perimeter/totatDistance;
	return rounds;
	
	}

    public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
 
 //Taking input of sides of triangle
 System.out.println("Enter the sides of triangular park (in km): ");
 int side1=sc.nextInt();
 int side2=sc.nextInt();
 int side3=sc.nextInt();
 
 int totRounds= numOfRounds(side1, side2, side3);
 System.out.println("To complete 5km the total round : "+ totRounds);
 
  }
}