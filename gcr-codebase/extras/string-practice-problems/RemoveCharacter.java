import java.util.Scanner;

public class RemoveCharacter {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
      String text = sc.nextLine();
    System.out.print("Enter character to remove ");
        char removeChar = sc.next().charAt(0);
		
        String result = "";

        for(inti=0;i<text.length();i++){
            if (text.charAt(i) != removeChar) {
                result = result + text.charAt(i);
            }
        }
   System.out.println("Modified String: " + result);
    }
}
