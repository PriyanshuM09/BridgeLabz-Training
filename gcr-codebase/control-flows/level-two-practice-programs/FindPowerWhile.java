import java.util.Scanner;
public class FindPowerWhile{
  public static void main(String[]args){
  
  Scanner sc=new Scanner(System.in);
  int number=sc.nextInt();
  int power=sc.nextInt();
  
  if(number<0 || power<0){
  System.out.println("Enter a positive integer");
  }
  else {
  int result=1;
  int counter=0;
 while(counter<power){
  result*=number;
  counter++;
  }
  System.out.println(result);
      }
    }
  }