import java.util.Scanner;

public class SplitTextIntoWords{
    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } 
	catch (StringIndexOutOfBoundsException e) {
          return count;
          }
    }

   public static String[] splitText(String text) {
        int len = findLength(text);
        int wordCount = 1;

        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }
      int[] spaceIndex = new int[wordCount + 1];
     spaceIndex[0] = -1;
      int idx = 1;

      for(int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndex[idx++] = i;
                }
        }
        spaceIndex[idx] = len;

        String[] words = new String[wordCount];

     for(int i = 0; i < wordCount; i++) {
            String word = "";
            for (int j = spaceIndex[i] + 1; j < spaceIndex[i + 1]; j++) {
                word = word + text.charAt(j);
            }
            words[i] = word;
        }
        return words;
    }

 public static boolean compareArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
           }

        for(int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
              }
          }
        return true;   }

   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
// input string
        String text = sc.nextLine();

        String[] customSplit = splitText(text);
        String[] builtInSplit = text.split(" ");
// result
        boolean result = compareArrays(customSplit, builtInSplit);

        System.out.println("Result of comparison: " + result);
    }
}
