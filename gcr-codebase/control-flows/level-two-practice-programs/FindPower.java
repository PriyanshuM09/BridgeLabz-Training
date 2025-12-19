//Create a program to find the power of a number
import java.util.Scanner;
public class FindPower{
  public static void main(String[]args){
  
  Scanner sc=new Scanner(System.in);
  int number=sc.nextInt();
  int power=sc.nextInt();
  
  if(number<0 || power<0){
  System.out.println("Enter a positive integer");
  }
  else {
  int result=1;
  for(int i=1;i<=power;i++){
  result*=number;
  }
  System.out.println(result);
      }
    }
  }