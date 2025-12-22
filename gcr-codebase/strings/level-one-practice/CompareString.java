//Write a program to compare two strings using the charAt() method and check the result with the built-in String equals() method

import java.util.Scanner;

public class CompareString{

public static boolean compare(String str1, String str2){ 
   
    if(str1.length() != str2.length()){
	return false;
	}
	
        for(int i=0;i<str1.length();i++){
           if(str1.charAt(i) != str2.charAt(i)){
            return false;
		   }
     } 
	 return true;
 
   }
       public static void main(String args[]){
       Scanner sc= new Scanner(System.in);

       String str1 = sc.nextLine();
       String str2= sc.nextLine();
	   
	   boolean result= compare(str1,str2);
	   System.out.println("result 1 by method : "+ result);
	   boolean result2= str1.equals(str2);
	   System.out.println("result 2 by inbuilt method   : "+ result2);
	   
	   if(result == result2){
	   System.out.println("both result are equal");
	   }

 }

 }