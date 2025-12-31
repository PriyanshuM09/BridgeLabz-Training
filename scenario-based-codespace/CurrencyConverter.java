 import java.util.Scanner;
 public class CurrencyConverter{
 public static void main(String args[]){
 Scanner sc= new Scanner(System.in);
 char choice;
 do{
       System.out.println(" Enter amount in INR to convert : ");
       double inr=sc.nextInt();
	   
	   System.out.println("choose target currency : ");
	   System.out.println("1. USD ");
	   System.out.println("2. EUR");
	   System.out.println("3. GBP ");
	   System.out.println("4. JPY ");
	   
	   int currency=sc.nextInt();
	   double convertedAmount=0;
	   switch(currency){
	      case 1: 
	         convertedAmount=inr * 0.012;
	        System.out.println(" Amount in USD "+ convertedAmount);
			break;
	      
		  case 2:
	         convertedAmount=inr * 0.012;
	       System.out.println(" Amount in EUR "+ convertedAmount);
		   break;
	   
	      case 3:
	         convertedAmount=inr * 0.0095;
	         System.out.println(" Amount in GBP "+ convertedAmount);
			 break;
	   
	      case 4:
	         convertedAmount=inr * 1.66;
	         System.out.println(" Amount in JPY "+ convertedAmount);
			 break;
			 
		  default :
		  System.out.println(" not valid option ");
		  
	   }
	     System.out.print("Do you want another conversion? (y/n): ");
            choice = sc.next().toLowerCase().charAt(0);
 
       }while(choice=='y');
      System.out.println("Thank you for using Currency Exchange Kiosk!");
 }
}