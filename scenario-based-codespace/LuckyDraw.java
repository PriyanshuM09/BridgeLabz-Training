// 20. Festival Lucky Draw 

import java.util.Scanner;
public class LuckyDraw{
public static void main(String args[]){
	System.out.println(" enter total num of visitor ");
Scanner sc= new Scanner(System.in);

int visitors=sc.nextInt();
for(int i=1;i<=visitors;i++){
  System.out.println(" visitor "+ i+" choose a number :");
  int num= sc.nextInt();
  
  if(num<=0){
  System.out.println("Invalid number try again ");
  continue;
  }
  
 if(num%3==0 && num%5==0){
     System.out.println(" congrats you won a gift :)");
 }
 else{ System.out.println(" Better luck next time ");
 }
 
  }
  System.out.println("Lucky draw completed.");
   }
}