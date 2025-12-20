//An organization took up an exercise to find the Body Mass Index (BMI) of all the persons in the team. For this create a program to find the BMI and display the height, weight, BMI and status of each individual

import java.util.Scanner;
public class BmiCalculator{
public static void main(String args[]){

Scanner sc= new Scanner(System.in);

// total persons input
int n= sc.nextInt();

// Arrays for height weights and status
double height[]=new double[n];
double weight[]= new double[n];
double bmi[]= new double[n];
String status[]= new String[n];

//Taking input for heights and weights
for(int i=0;i<n;i++){
System.out.println(" for person  "+(i+1));
     System.out.println("enter Heights of persons :");
	 height[i]= sc.nextDouble();
	 
	 System.out.println("enter Weights of persons :");
	  weight[i]= sc.nextDouble();
	  
      }
	  
for( int i=0;i<n;i++){
bmi[i]= weight[i]/(height[i] *height[i]);

if(bmi[i]<= 18.4){
status[i]="Underweight";
}
else if(bmi[i]<=24.9){
status[i]="Normal";
}
else if(bmi[i]<=39.9){
status[i]="Over Weight";
}else{
status[i]="Obese";
}
}  

// print 
for(int i=0;i<n;i++){
System.out.println(" person  :"+(i+1));
System.out.println(" weight  "+weight[i]);
System.out.println(" height  "+ height[i]);
System.out.println(" Bmi "+ bmi[i]);
System.out.println(" Status  "+status[i]);
}

 }

 }
