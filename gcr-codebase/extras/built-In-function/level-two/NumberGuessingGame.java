import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame{

 static int generateGuess(int min, int max){
    Random rand = new Random();
     return rand.nextInt(max-min+1)+min;
    }

 static char getUserFeedback(Scanner sc){
  System.out.print("Enter feedback(h=high,l=low,c=correct) ");
   return sc.next().charAt(0);
    }

static int[] updateRange(char feedback,int guess,int min,int max) {
    if(feedback=='h'){
     max = guess- 1;
       }
	else if(feedback == 'l'){
     min = guess+ 1;
        }
  return new int[]{min, max};
       }
  public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
        int min = 1;
        int max = 100;
        char feedback;
    while(true){
       int guess = generateGuess(min, max);
        System.out.println("Computer guesses " + guess);
     feedback = getUserFeedback(sc);
        if (feedback=='c') {
     System.out.println("Computer guessed the correct number");
                break;
        }

    int[] range= updateRange(feedback, guess, min, max);
     min= range[0];
    max= range[1];
        }
    }
}