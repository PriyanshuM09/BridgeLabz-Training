import java.util.Scanner;
public class UnitConvertor{ 
    public static double convertKmToMiles(double number){
     double km2miles = 0.621371;
     return number*km2miles;
     }
   
       public static double convertMilesToKm(double number) {
	    double miles2km=1.60934;
		return number*miles2km;
		}
		
		public static double convertMetersToFeet(double number){
		double meters2Feet= 3.28084;
		return number*meters2Feet;
		}
		 public static double convertFeetToMeters(double number) {
        double feet2meters = 0.3048;
        return number * feet2meters;
		}
    }
		

  public static void main(String[]args){
  
   Scanner sc=new Scanner(System.in);
   double number=sc.nextDouble();
   
     System.out.println(" km to miles: " + UnitConvertor.convertKmToMiles(number));
        System.out.println(" miles to km: " + UnitConvertor.convertMilesToKm(number));
        System.out.println(" meters to feet: " + UnitConvertor.convertMetersToFeet(number));
        System.out.println(" feet to meters: " + UnitConvertor.convertFeetToMeters(number));
    }
	 
	}
   