//Create a program to divide N number of chocolates among M children. Print the number of chocolates each child will get and also the remaining chocolates

import java.util.Scanner;

public class ChocolateDistribution{

    public static int[] calculateChocolates(int totalChocolates, int totalChildren){

   int chocolatesPerChild = totalChocolates / totalChildren;
   int remainingChocolates = totalChocolates % totalChildren;
      int[] result = new int[2];
        result[0] = chocolatesPerChild;
        result[1] = remainingChocolates;
             return result;
   }

    public static void main(String[] args){

                Scanner sc = new Scanner(System.in);

    // Taking input from user
    System.out.print("Enter total chocolates ");
       int chocolates = sc.nextInt();
      System.out.print("Enter number of children ");
         int children = sc.nextInt();

           int[] answer = calculateChocolates(chocolates, children);
   
   System.out.println("Each child will get: " + answer[0] + " chocolates");
   
       System.out.println("Remaining chocolates are: " + answer[1]);
       }
}
