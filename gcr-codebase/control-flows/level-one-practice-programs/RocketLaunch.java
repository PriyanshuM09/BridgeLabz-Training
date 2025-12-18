//Write a program to count down the number from the user input value to 1 using a while loop for a rocket launch
import java.util.Scanner;

public class RocketLaunch{
	public static void main(String args[]){
		
		Scanner sc= new Scanner(System.in);
		
		//Taking input for countdown
		int counter= sc.nextInt();
		
		// while loop for countdown
		while(counter>0){
			System.out.print(counter+" ");
			counter--;
		}
		
	}
}