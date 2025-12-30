// 12. Train Reservation Queue 


import java.util.Scanner;
public class ReservationQueue{
public static void main(String args[]){
Scanner sc= new Scanner(System.in);
int totalSeats=5;
int choice;

while(true){
System.out.println("Ticket Booking System : ");
System.out.println("1. Book Ticket");
System.out.println("2. Check Status");
System.out.println("3. Exit ");

choice= sc.nextInt();

      switch(choice){
	  case 1:
	  if(totalSeats>0){ 
	      totalSeats--;
	      System.out.println(" ticket booked successfully");
	  }
	  else{System.out.println(" ticket are not available");}
	  break;
	  
	  case 2:
	  System.out.println("Total seats available" + totalSeats);
	  break;
	  
	  case 3:
	  System.out.println("exiting reservation system ");
	  return;
	  
	  default:
        System.out.println("Invalid choice. Try again.");
	  }
	  
	   if (totalSeats == 0) {
        System.out.println("\nAll seats are booked. Booking closed.");
                break;
            } 

}
  }
}