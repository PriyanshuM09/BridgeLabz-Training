// Rewrite the program 10 to find the sum until the user enters 0 or a negative number using while loop and break statement
import java.util.Scanner;

public class SumUntilNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        while (true) {  // infinite loop
            System.out.print("Enter a number: ");
            int num = sc.nextInt();
			
            // check for 0 or negative
            if (num <= 0) {   
                break;        
            }
          // add to sum
            sum += num;       
        }

        System.out.println("Sum = " + sum);
      
	 
    }
}