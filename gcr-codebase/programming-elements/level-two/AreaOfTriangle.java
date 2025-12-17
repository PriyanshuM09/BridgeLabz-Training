import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Input
        double base = sc.nextDouble();
        double height = sc.nextDouble();

        // Area in square centimeters
        double areaSqCm = 0.5 * base * height;

        // Convert cm to inches 
        double baseIn = base / 2.54;
        double heightIn = height / 2.54;

        // Area in square inches
        double areaSqIn = 0.5 * baseIn * heightIn;

        // Output
        System.out.println(
            "The Area of the triangle in sq in is " + areaSqIn +
            " and sq cm is " + areaSqCm
        );
    }
}
