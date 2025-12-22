// Write a program to create a substring from a String using the charAt() method. Also, use the String built-in
//method substring() to find the substring of the text. Finally Compare the the two strings and display the resultsScanner
import java.util.Scanner;
public class CompareSubstring{

public static String createSubString(String s1, int start, int end){
String subString ="";

for (int i=start;i<end;i++){
       subString= subString+s1.charAt(i);
   }
   return subString;
}
public static boolean compareSubstring(String str1,String str2){
if(str1.length()!=str2.length()) return false;

     for(int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
             }
      }
     return true;
}

public static void main(String args[]){
Scanner sc= new Scanner(System.in);

String s1= sc.next();

int start= sc.nextInt();

int end= sc.nextInt();

String str1=createSubString(s1,start,end);
 String str2 = s1.substring(start, end);

  // Comparing both substrings
    boolean result = compareSubstring(str1,str2);
	
	System.out.println("Substring by created method " +str1);
    System.out.println("Substring by inbuilt method " +str2);
  System.out.println("Are both substrings equal? " + result);


  }
}
