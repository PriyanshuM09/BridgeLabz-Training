// Maximum of Three Numbers
import java.util.Scanner;

public class MaxNumber{

public static int[] takeInput(){
	Scanner sc= new Scanner(System.in);
 int nums[]= new int[3];
 for(int i=0;i<nums.length;i++){
 nums[i]= sc.nextInt();
 }
 return nums;
}
public static int maxNumber(int nums[]){
int max= nums[0];

  if(nums[1]>max){
  max= nums[1];
  }
 if(nums[2]>max){
  max=nums[2];
  }
  return max;
 }
 
public static void main(String args[]){
int numbers[]= takeInput();
int maxNum= maxNumber(numbers);
System.out.println(" Max number is : "+ maxNum);
 }
}