// 14. Movie Ticket Booking App 


import java.util.Scanner;
public class MovieTicketBookingApp{
    public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    char continueBooking;
        while(true){
      int ticketPrice = 0;
      int snackPrice = 0;

     System.out.println("\n--- Movie Ticket Booking ---");
         System.out.println("1. Action Movie");
          System.out.println("2. Comedy Movie");
        System.out.println("3. Drama Movie");
          System.out.print("Choose movie type: ");
          int movieType = sc.nextInt();

     // Movie type price using switch
     switch (movieType){
         case 1:
               ticketPrice = 200;
                    break;
           case 2:
                 ticketPrice = 180;
                    break;
          case 3:
                ticketPrice = 150;
                    break;
         default:
              System.out.println("Invalid movie type.");
                    continue;
            }

            // Seat type selection
   System.out.print("Enter seat type (Gold/Silver): ");
      String seatType = sc.next();

     if(seatType.equalsIgnoreCase("Gold")){
                ticketPrice += 100;
            }
	else if(seatType.equalsIgnoreCase("Silver")){
                ticketPrice += 50;
            } 
		else{
                System.out.println("Invalid seat type.");
                continue;
            }
            // Snacks option
            System.out.print("Do you want snacks? (yes/no): ");
            String snacks = sc.next();

      if(snacks.equalsIgnoreCase("yes")){
                snackPrice = 80;
            }

     int totalBill = ticketPrice + snackPrice;

           
    System.out.println("\n--- Bill Details ---");
     System.out.println("Ticket Price : " + ticketPrice);
      System.out.println("Snacks Price : " + snackPrice);
     System.out.println("Total Amount : " + totalBill);

       // Continue for next customer
    System.out.print("\nNext customer? (y/n): ");
      continueBooking = sc.next().charAt(0);

     if(continueBooking == 'n' || continueBooking == 'N') {
       System.out.println("Booking closed. Thank you!");
             break;
            }
        }
    }
}
