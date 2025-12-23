import java.util.Scanner;

public class RockPaperScissors{

    public static String getComputerChoice(){
  int choice = (int) (Math.random() * 3);
   if (choice == 0)
           return "Rock";
   else if(choice == 1)
            return "Paper";
    else
        return "Scissors";
    }
    public static String findWinner(String user, String computer){
if(user.equalsIgnoreCase(computer){
            return "Draw";
           }
 if((user.equalsIgnoreCase("Rock") && computer.equals("Scissors")) ||(user.equalsIgnoreCase("Paper") && computer.equals("Rock")) ||
          (user.equalsIgnoreCase("Scissors") && computer.equals("Paper"))){ return "User"; } 
   else{
          return "Computer";
      }
       }
      public static String[][] calculateStats(int userWins, int computerWins, int totalGames){
  double userPercent = (userWins * 100.0)/totalGames;
  double computerPercent =(computerWins * 100.0) / totalGames;

 String[][] stats = new String[2][3];

    stats[0][0] = "User";
     stats[0][1] = String.valueOf(userWins);
     stats[0][2] = String.format("%.2f", userPercent) + "%";

   stats[1][0] = "Computer";
    stats[1][1] = String.valueOf(computerWins);
   stats[1][2] = String.format("%.2f", computerPercent) + "%";
    return stats;
    }
	
  public static void displayResults(String[][] gameResults, String[][] stats){
   for(int i = 0; i < gameResults.length; i++){
            System.out.println((i + 1) + "\t" +gameResults[i][0] + "\t" +gameResults[i][1] + "\t\t" +gameResults[i][2]);
        };
		
    for(int i = 0; i < stats.length; i++) {System.out.println(stats[i][0] + "\t" +
       stats[i][1] + "\t" + stats[i][2]);
        }
   }
    public static void main(String[] args){
          Scanner sc = new Scanner(System.in);
  System.out.print("Enter number of games: ");
 int games = sc.nextInt();
    String[][] gameResults = new String[games][3];
  int userWins = 0;
  int computerWins = 0;
  
    for(int i = 0; i < games; i++){
 System.out.print((i + 1) + " - Enter your choice ");
  String userChoice = sc.next();

     String computerChoice = getComputerChoice();
    String winner = findWinner(userChoice, computerChoice);

    if(winner.equals("User"))
           userWins++;
     else if(winner.equals("Computer"))
            computerWins++;
      gameResults[i][0] = userChoice;
       gameResults[i][1] = computerChoice;
          gameResults[i][2] = winner;
        }
     String[][] stats = calculateStats(userWins, computerWins, games);
      displayResults(gameResults, stats);
    }
}
