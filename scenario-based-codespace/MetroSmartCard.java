import java.util.Scanner;

public class MetroSmartCard{
  public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
     double balance = 100.0;

   while(balance > 0){
       System.out.println("Current Balance: " + balance);
          System.out.print("Enter distance travelled (0 to quit): ");
        int distance = sc.nextInt();

      if(distance ==0){
                break;
            }
      int fare =(distance<=5)?10:20;

       if(balance >=fare){
            balance = balance - fare;
          System.out.println("Fare deducted: ₹" + fare);
            } 
			else{
                System.out.println("Insufficient balance");
                break;
            }
        }
    System.out.println("\nTransaction Ended");
    System.out.println("Remaining Balance: " + balance);
    }
}
