import java.util.Scanner;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int n = nums.length;

   for(int i= 0;i<n;i++){
      for(int j=i + 1;j < n; j++){
        if(nums[i]+nums[j] == target){
         return new int[]{i, j};
            }
            }
        }
	// no solution	
    return new int[]{}; 
    }
  public static void main(String[] args){
	  
  Scanner sc = new Scanner(System.in);

      // Taking array size
  System.out.print("Enter number of elements: ");
   int n = sc.nextInt();

  int[] nums = new int[n];

      // Taking array elements
  System.out.println("Enter array elements:");
    for(int i =0;i<n;i++){
            nums[i] = sc.nextInt();
        }
  System.out.print("Enter target value: ");
   int target = sc.nextInt();
   int[] result = twoSum(nums, target);

   if(result.length > 0){
   System.out.println("Indices are: " + result[0] + " and " + result[1]);
        }
	else{
   System.out.println("No solution found");
        }
    }
}
