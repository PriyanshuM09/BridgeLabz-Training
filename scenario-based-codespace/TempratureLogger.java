// Temperature Logger 

import java.util.Scanner;
public class TempratureLogger{
public static void main(String args[]){
 Scanner sc= new Scanner(System.in);
 int arr[]=new int[7];
 
 for(int i=0;i<7;i++){
 arr[i]= sc.nextInt();
 }
 
 double avg;
 int tot=0;
 int maxTemprature= Integer.MIN_VALUE;
 
 for(int i=0;i<arr.length;i++){
   if(arr[i]>maxTemprature){
    maxTemprature=arr[i];
   }
   tot+=arr[i];
  }
  avg= tot/7;
  System.out.println("Max tempature is :"+ maxTemprature);
  System.out.println("Average is :"+avg);
}
}
