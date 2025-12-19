import java.util.Scanner;

public class Multiples{
  public static void main(String[]args){
  
      Scanner sc = new Scanner(System.in);  
        int number = sc.nextInt();

        // Check if number is positive integer and it is less than 100
        if (number <= 0 || number >= 100) {
            System.out.println(" enter valid number");
        } else {
            System.out.println("multiples of "+number + " below 100");

          
            for (int i = 100; i >= 1; i--) {
                if (i % number == 0) {
                    System.out.println(i);
          }
         }
     }

   }
}