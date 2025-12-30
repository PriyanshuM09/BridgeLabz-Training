// 13. Sandeep’s Fitness Challenge Tracker 


import java.util.Scanner;
public class FitnessTracker{
public static void main(String args[]){
Scanner sc= new Scanner(System.in);
int arr[]= new int[7];

for(int i=0;i<arr.length;i++){
arr[i]=sc.nextInt();
}
int total=0;
int activeDays=0;

for(int count : arr){
if(count==0){continue;}

total+=count;
activeDays++;
}
double avg= total/activeDays;

System.out.println("the total push count of week is : "+ total);
System.out.println("the average pushup per day is  : "+ avg);
  }
}