// Palindrome Checker:
import java.util.Scanner;
public class PalindromeChecker{

public static String takeInput(){
 Scanner sc= new Scanner(System.in);
 String text= sc.next();
 return text;
 }
 public static boolean isPalindrome(String text){
 int start=0;
 int end= text.length()-1;
 
 while(start<end){
    if (text.charAt(start) != text.charAt(end)) {
        return false;
            }
       start++;
        end--;
        }
   return true;
   }
 
 public static void main(String args[]){
 String input= takeInput();
 boolean results= isPalindrome(input);
  if(results){
 System.out.println("String is palindrome");}
  else{
 System.out.println("String is not palindrome");
}

}
}