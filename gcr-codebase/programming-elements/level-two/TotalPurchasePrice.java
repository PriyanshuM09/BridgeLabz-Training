import java.util.Scanner;

public class TotalPurchasePrice {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Input
        double unitPrice = sc.nextDouble();
        int quantity = sc.nextInt();

        // Calculation
        double totalPrice = unitPrice * quantity;

        // Output
        System.out.println(
            "The total purchase price is INR " + totalPrice +" if the quantity " + quantity +" and unit price is INR " + unitPrice);

    }
}
