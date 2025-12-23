import java.util.Scanner;

public class CompareStrings{
  public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
 
       String s1 = sc.nextLine();
       String s2 = sc.nextLine();

  int minLength = s1.length()< s2.length()? s1.length() : s2.length();
      boolean isEqual = true;

  for(int i= 0;i< minLength;i++){

      if(s1.charAt(i) < s2.charAt(i)){
     System.out.println("\"" + s1 + "\" comes before \"" + s2 + "\"");
     isEqual = false;
     break;
     }
    else if(s1.charAt(i) > s2.charAt(i)){
     System.out.println("\"" + s1 + "\" comes after \"" + s2 + "\"");
      isEqual = false;
       break;
            }
        }

     if(isEqual){
          if(s1.length() == s2.length()){
     System.out.println("Both strings are equal");
            }
		else if (s1.length() < s2.length()) {
                System.out.println("\"" + s1 + "\" comes before \"" + s2 + "\"");
            }
		else {
                System.out.println("\"" + s1 + "\" comes after \"" + s2 + "\"");
               }
         }
  }
}
