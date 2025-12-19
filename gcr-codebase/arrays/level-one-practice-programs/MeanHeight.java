// Create a program to find the mean height of players present in a football team.
import java.util.Scanner;

public class MeanHeight {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        // Creating double array of size 11
        double heights[] = new double[11];

        double sum = 0.0;
        double mean;

        // Taking input heights of players
        System.out.println("Enter the heights of 11 football players:");
        for (int i = 0; i < 11; i++) {
            heights[i] = sc.nextDouble();
            sum = sum + heights[i];
        }

        // Calculating mean height
        mean = sum / 11;

        // Displaying the mean height
        System.out.println("Mean height of the football team is: " + mean);
    }
}
