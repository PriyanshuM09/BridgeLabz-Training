// Program to convert height from centimeters to feet and inches
import java.util.Scanner;

public class HeightConversion
{  
    public static void main(String[] args)
    {
        //declare variables
        double heightCm;
        //Scanner object
        Scanner input = new Scanner(System.in); 

        //taking user input
        heightCm = input.nextDouble(); 

       
        double totalInches = heightCm / 2.54; 
        int feet = (int)(totalInches / 12);   
        double inches = totalInches % 12;     
        
        System.out.println("Your Height in cm is " + heightCm +
                           " while in feet is " + feet +
                           " and inches is " + inches); //Display the result
    }
}
