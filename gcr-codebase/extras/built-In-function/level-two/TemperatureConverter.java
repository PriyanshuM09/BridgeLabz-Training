// Temperature Converter:
import java.util.Scanner;
public class TemperatureConverter{
    public static double celsiusToFahrenheit(double celsius){
  return(celsius*=9/5)+32;
    }
  public static double fahrenheitToCelsius(double fahrenheit){
     return(fahrenheit-32)*5/9;
    }
 public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Choose conversion type:");
     System.out.println("1. Celsius to Fahrenheit");
     System.out.println("2. Fahrenheit to Celsius");

  int choice=sc.nextInt();
   if (choice == 1){
            System.out.println("Enter temperature in Celsius:");
            double celsius = sc.nextDouble();
            double result = celsiusToFahrenheit(celsius);
            System.out.println("Temperature in Fahrenheit: " + result);
        } 
   else if(choice == 2){
     System.out.println("Enter temperature in Fahrenheit:");
     double fahrenheit = sc.nextDouble();
     double result = fahrenheitToCelsius(fahrenheit);
     System.out.println("Temperature in Celsius: " + result);
        } 
        else {
       System.out.println("Invalid choice");
        }
    }
}
