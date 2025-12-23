import java.util.Scanner;

public class MostFrequentChar{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);

    System.out.print("Enter a string: ");
   String text = sc.nextLine();

    int maxCount = 0;
     char mostFrequent = text.charAt(0);

    for(int i = 0; i < text.length(); i++){
            int count = 0;
    for(int j= 0; j<text.length(); j++){
                if (text.charAt(i) == text.charAt(j)){
            count++;
                }
            }
    if (count > maxCount) {
       maxCount = count;
      mostFrequent = text.charAt(i);
            }
        }
  System.out.println("Most Frequent Character: '" + mostFrequent + "'");
    }
}
