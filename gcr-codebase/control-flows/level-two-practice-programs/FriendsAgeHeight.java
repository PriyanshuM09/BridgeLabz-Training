// Create a program to find the youngest friends among 3 Amar, Akbar, and Anthony based on their ages and the tallest among the friends based on their heights
import java.util.Scanner;

public class FriendsAgeHeight {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        // Taking age input
        int amarAge = sc.nextInt();
        int akbarAge = sc.nextInt();
        int anthonyAge = sc.nextInt();

        // Taking height input
        int amarHeight = sc.nextInt();
        int akbarHeight = sc.nextInt();
        int anthonyHeight = sc.nextInt();

        // Finding youngest friend
        if (amarAge < akbarAge && amarAge < anthonyAge) {
            System.out.println("Amar is the youngest friend");
        } else if (akbarAge < amarAge && akbarAge < anthonyAge) {
            System.out.println("Akbar is the youngest friend");
        } else {
            System.out.println("Anthony is the youngest friend");
        }

        // Finding tallest friend
        if (amarHeight > akbarHeight && amarHeight > anthonyHeight) {
            System.out.println("Amar is the tallest friend");
        } else if (akbarHeight > amarHeight && akbarHeight > anthonyHeight) {
            System.out.println("Akbar is the tallest friend");
        } else {
            System.out.println("Anthony is the tallest friend");
        }
    }
}
