// Rewrite the above program using multi-dimensional array to store height, weight, and BMI in 2D array for all the persons
import java.util.Scanner;

public class BMIUsing2DArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take number of persons
        System.out.print("Enter number of persons: ");
        int number = sc.nextInt();

        // 2D array: [weight, height, BMI]
        double[][] personData = new double[number][3];
        String[] weightStatus = new String[number];

        // Input weight and height
        for (int i = 0; i < number; i++) {

            System.out.println("\nEnter details for Person " + (i + 1));

            // Weight input
            do {
                System.out.print("Enter weight (in kg): ");
                personData[i][0] = sc.nextDouble();
            } while (personData[i][0] <= 0);

            // Height input
            do {
                System.out.print("Enter height (in meters): ");
                personData[i][1] = sc.nextDouble();
            } while (personData[i][1] <= 0);

            // Calculate BMI
            personData[i][2] = personData[i][0] / 
                              (personData[i][1] * personData[i][1]);

            // Determine weight status
            if (personData[i][2] < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] < 25) {
                weightStatus[i] = "Normal";
            } else if (personData[i][2] < 30) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        // Display results
        System.out.println("\nPerson Details:");
        for (int i = 0; i < number; i++) {
            System.out.println("\nPerson " + (i + 1));
            System.out.println("Weight: " + personData[i][0] + " kg");
            System.out.println("Height: " + personData[i][1] + " m");
            System.out.println("BMI: " + personData[i][2]);
            System.out.println("Status: " + weightStatus[i]);
        }
    }
}
