// Write a program to calculate various trigonometric functions using Math class given an angle in degrees

import java.util.Scanner;

public class TrigonometricCalculator{
    public static double[] calculateTrigonometricFunctions(double angle) {
              double radian = Math.toRadians(angle);

      double sine = Math.sin(radians);
    double cosine = Math.cos(radians);
    double tangent = Math.tan(radians);

    double[] result = new double[3];
      result[0] = sine;
      result[1] = cosine;
     result[2] = tangent;
        return result;
    }

         
		 public static void main(String[] args) {
               Scanner sc = new Scanner(System.in);

             // Taking input from user
                 System.out.print("Enter angle in degrees: ");
                    double angle = sc.nextDouble();
					
       double[] values = calculateTrigonometricFunctions(angle);
	   
     System.out.println("Sine value is: " + values[0]);
    System.out.println("Cosine value is: " + values[1]);
   System.out.println("Tangent value is: " + values[2]);
    }
}
