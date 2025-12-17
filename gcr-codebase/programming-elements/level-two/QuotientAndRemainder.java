import java.util.*;

public class QuotientAndRemainder {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Input
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();

        // Calculation
        int quotient = number1 / number2;
        int remainder = number1 % number2;

        // Output
        System.out.println(
            "The Quotient is " + quotient +" and Reminder is " + remainder +" of two number " + number1 +" and " + number2
        );

       
    }
}
