import java.util.Scanner;

public class NumberFactors {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        // Check if number is a positive integer
        if (number <= 0) {
            System.out.println(" enter a positive integer");
        } else {
            System.out.println("Factors of " + number + " are");

           
            for (int i = 1; i < number; i++) {
                if (number % i == 0) {
                    System.out.println(i);
                }
            }
        }

    }
}
