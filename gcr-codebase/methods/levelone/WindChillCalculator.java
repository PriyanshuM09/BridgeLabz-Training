// Write a program calculate the wind chill temperature given the temperature and wind speed
import java.util.Scanner;
public class WindChillCalculator{
 
 public static double calculateWindChill(double temperature, double windSpeed){
 
    double windChill= 35.74 + (0.6215 * temperature)+ (0.4275 * temperature -35.75) *Math.pow(windSpeed, 0.16);
    return windChill;
  }

 public static void main(String[] args){
Scanner sc = new Scanner(System.in);

  // Taking input from user
     System.out.print("Enter temperature ");
    double temp = sc.nextDouble();

     System.out.print("Enter wind speed: ");
    double speed = sc.nextDouble();

        double result = calculateWindChill(temp, speed);
		
		
   System.out.println("Wind Chill Temperature is " + result);

   
   }
}
