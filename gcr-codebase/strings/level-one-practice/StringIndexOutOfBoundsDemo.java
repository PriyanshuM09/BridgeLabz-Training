import java.util.Scanner;

public class StringIndexOutOfBoundsDemo {
    static void generateException(String text) {

   System.out.println(text.charAt(text.length()));
    }

    static void handleException(String text) {
      try{
            System.out.println(text.charAt(text.length()));
          } 
    catch(StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException caught and handled");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking user input
      System.out.print("Enter a string: ");
     String text = sc.nextLine();

    System.out.println("\nGenerating StringIndexOutOfBoundsException:");
        generateException(text);

      System.out.println("\nHandling StringIndexOutOfBoundsException:");
      handleException(text);
    }
}
