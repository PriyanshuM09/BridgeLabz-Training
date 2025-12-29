import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame{
public static void main(String args[]){
Scanner sc= new Scanner(System.in);

// Initializing random object
Random random= new Random();

int secretNumber=random.nextInt(100)+1;
   int guess;
   int attempt=0;
   int maxAttempt=5;
   boolean guessedCorrectly=false;
   
   System.out.println("guess the number between 1 to 100");
   
   //Using do while for checking number is correct or not by guess
   do{
   System.out.println("Enter your guess");
   guess = sc.nextInt();
   
   if(guess==secretNumber){
	   attempt++;
   guessedCorrectly=true;
   System.out.println("Entered number is correct");
   break;
   }
   else if(guess<secretNumber){
	    attempt++;
   System.out.println("Too low");
     }
	 else{
        attempt++;		 
	 System.out.println("Too high");
	  }
	  if(attempt==maxAttempt){
	   System.out.println(" reached the maximum attempts ");
                break;
			}
      } while
		(!guessedCorrectly);
         }
 }
