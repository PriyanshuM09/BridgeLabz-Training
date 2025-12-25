import java.util.Scanner;

public class CoffeeCounter{
  public static void main(String[] args){

   Scanner sc= new Scanner(System.in);
   double GST_RATE= 0.05; 
   while (true){
    System.out.println("\nAvailable Coffee Types:");
       System.out.println("1. Espresso");
       System.out.println("2. Cappuccino");
       System.out.println("3. Latte");
       System.out.println("exit");

     System.out.print("Enter coffee type (1/2/3 or exit): ");
	 // user input
     String input= sc.next();

     if(input.equalsIgnoreCase("exit")){
             break;
            }
    int choice= Integer.parseInt(input);
     double pricePerCup = 0;
        switch (choice){
                case 1:
                    pricePerCup= 120;
                    break;
              case 2:
                    pricePerCup= 150;
                    break;
                case 3:
                    pricePerCup= 180;
                    break;
                default:
     System.out.println("Invalid choice ");
                    continue;
            }
      System.out.print("Enter quantity: ");
      int quantity= sc.nextInt();
       // calculate amount
      double totalAmount = pricePerCup * quantity;
      double gstAmount = totalAmount * GST_RATE;
      double finalBill = totalAmount + gstAmount;

      System.out.println("Base Amount:" + totalAmount);
      System.out.println("GST (5%): " + gstAmount);
       System.out.println("Total Bill: " + finalBill);
        }

    }
}
