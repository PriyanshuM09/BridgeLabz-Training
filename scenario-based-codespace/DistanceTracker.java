// 19. Bus Route Distance Tracker 


import java.util.Scanner;

public class DistanceTracker{
public static void main(String args[]){
Scanner sc= new Scanner(System.in);
double totDistance=0;
char choice='n';

    while(true){
	System.out.println("Enter distance you want to travel  : ");
	double distance= sc.nextDouble();
	
	totDistance+=distance;
	System.out.println("Total distance traveled: " + totDistance + " km");

     System.out.print("Do you want to get off at this stop? (y/n): ");
	
     choice =sc.next().toLowerCase().charAt(0);
	 if(choice=='y'){break;}
    }
        System.out.println("Journey ended.");
        System.out.println("Total distance covered: " + totDistance + " km");
  }
}