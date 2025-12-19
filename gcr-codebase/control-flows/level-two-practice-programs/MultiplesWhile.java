import java.util.Scanner;

public class MultiplesWhile{
  public static void main(String[]args){
  
      Scanner sc = new Scanner(System.in);  
        int number = sc.nextInt();

        // Check if number is positive integer and it is less than 100
        if (number <= 0 || number >= 100) {
            System.out.println(" enter valid number");
        } else {
            System.out.println("multiples of "+number + " below 100");

          int counter=number-1;
           while (counter>1) {
                if (counter % number == 0) {
                    System.out.println(counter);
          }
		  counter--;
         }
     }

   }
}