import java.util.Scanner;

public class LowerCaseCompare {

   public static String convertToLower(String text) {
        String result = "";
		
    for (int i = 0; i < text.length(); i++){
                char ch = text.charAt(i);

            if ch >= 'A' && ch <= 'Z'){
                result = result + (char) (ch + 32);
                    } 
			else{
                result = result + ch;
              }
      }

     return result;
    }

      public static boolean compareStrings(String s1, String s2) {

        if (s1.length() != s2.length()){
            return false;
        }

     for(int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
    return true;
    }

   public static void main(String args[]) {

      Scanner sc = new Scanner(System.in);
          // taking input
         String text = sc.nextLine();

        String userLower = convertToLower(text);
        String builtInLower = text.toLowerCase();

        boolean result = compareStrings(userLower, builtInLower);
        // printing result
        System.out.println(userLower);
        System.out.println(builtInLower);
        System.out.println(result);
      }
}
