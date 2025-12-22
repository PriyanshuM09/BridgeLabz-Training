import java.util.Scanner;

public class VowelConsonantCheck {

    public static String checkChar(char ch){

  // Convert uppercase to lowercase using ASCII
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + 32);
             }

     // Check if character is a letter
        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            }
		else {
                return "Consonant";
            }
            }
        return "Not a Letter";
          
		  }

  public static String[][] analyzeString(String text) {
       int len = text.length();
        String[][] result = new String[len][2];

            for (int i = 0; i < len; i++){
         result[i][0] = String.valueOf(text.charAt(i));
          result[i][1] = checkChar(text.charAt(i));
             }
        return result;
    }
  public static void displayTable(String[][] data) {
     System.out.println("Character\tType");
        for(int i = 0; i < data.length; i++){
            System.out.println(data[i][0] + "\t\t" + data[i][1]);
          }
         }

  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from user
        String text = sc.nextLine();

        String[][] result = analyzeString(text);
        displayTable(result);
    }
}
