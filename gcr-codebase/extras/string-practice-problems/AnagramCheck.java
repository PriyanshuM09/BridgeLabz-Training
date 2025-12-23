import java.util.Scanner;

public class AnagramCheck{

 public static void main(String[] args){

   Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine().toLowerCase();

    System.out.print("Enter second string: ");
      String s2 = sc.nextLine().toLowerCase();

  if(s1.length() != s2.length(){
    System.out.println("Strings are NOT Anagrams");
      return;
        }
   int[] count = new int[26];

  for(int i=0;i<s1.length(); i++){
     count[s1.charAt(i) - 'a']++;
    count[s2.charAt(i) - 'a']--;
        }
    boolean isAnagram = true;
 for(int i=0;i<26;i++){
    if (count[i] != 0) {
       isAnagram = false;
        break;
            }
     }
   if(isAnagram){
    System.out.println("Strings are Anagrams");
        } 
	else{
       System.out.println("Strings are NOT Anagrams");
      }
  }
}
