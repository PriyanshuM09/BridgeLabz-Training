import java.util.Scanner;

public class ElectionBoothManager{
  public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

    int candidate1Votes = 0;
    int candidate2Votes = 0;
    int candidate3Votes = 0;
    while(true){
      System.out.print("Enter age of voter (-1 to exit): ");
         int age = sc.nextInt();
          if (age == -1) {
                break;
            }
     if(age >= 18){
         System.out.println("Eligible to vote");
          System.out.println("Press 1 for Candidate 1");
          System.out.println("Press 2 for Candidate 2");
          System.out.println("Press 3 for Candidate 3");
          int vote = sc.nextInt();

    switch(vote){
         case 1:
            candidate1Votes++;
                break;
         case 2:
            candidate2Votes++;
                 break;
          case 3:
            candidate3Votes++;
               break;
              default:
       System.out.println("Invalid vote");
                }
            } 
		else{
          System.out.println("Not eligible to vote");
            }
        }
 System.out.println("Candidate 1 Votes: " + candidate1Votes);
  System.out.println("Candidate 2 Votes: " + candidate2Votes);
  System.out.println("Candidate 3 Votes: " + candidate3Votes);
    }
}
