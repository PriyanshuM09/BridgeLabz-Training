import java.util.Scanner;

public class BMIFitnessTracker{
   public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

  // Taking height and weight as input
    System.out.print("Enter height in meters: ");
     double height = sc.nextDouble();
    System.out.print("Enter weight in kilograms: ");
     double weight = sc.nextDouble();

  // Calculating BMI using the formula
        double bmi = weight / (height * height);
        System.out.println("Your BMI is: " + bmi);
        if(bmi<18.5){
            System.out.println("BMI Category: Underweight");
        }
		else if(bmi >= 18.5 && bmi < 25){
            System.out.println("BMI Category: Normal");
        } 
		else{
            System.out.println("BMI Category: Overweight");
        }
    }
}
