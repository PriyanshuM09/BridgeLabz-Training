import java.util.Scanner;

class Solution RemoveDuplicate{
    public static int removeDuplicates(int[] nums) {

     if(nums.length == 0){
      return 0;
      }

   int j = 0;
  for(int i=1;i<nums.length; i++) {
            if (nums[j] != nums[i]) {
                nums[++j] = nums[i];
            }
        }
        return j + 1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter sorted array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int newLength = removeDuplicates(nums);

        System.out.println("New length after removing duplicates: " + newLength);
        System.out.print("Array after removing duplicates: ");

        for(int i = 0; i < newLength; i++){
      System.out.print(nums[i] + " ");
        }
    }
}
