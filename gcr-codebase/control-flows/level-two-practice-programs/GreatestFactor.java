import java.util.Scanner;

public class GreatestFactor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        // Check for positive integer
        if (number <= 1) {
            System.out.println("No greatest factor");
        } else {

            int greatestFactor = 1; 

           
            for (int i = number - 1; i >= 1; i--) {
                if (number % i == 0) {
                    greatestFactor = i;
					
					//  exits the loop 
                    break;  
                }
            }

        
            System.out.println( "Greatest factor of " + number + " excluding itself is: " + greatestFactor);
        }
    }
}
