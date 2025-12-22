import java.util.Arrays;
import java.util.Scanner;

public class NumberCheck{
   public static int countDigits(int number) {
        int count = 0;
        int n = number;
        while (n != 0) {
            n /= 10;
            count++;
        }
        return count;
    }
    public static int[] getDigitsArray(int number){
          int n = countDigits(number);
        int[] digits = new int[n];
         int temp = number;
        for (int i = n - 1; i >= 0; i--){
            digits[i] = temp % 10;
            temp /= 10;
        }
      return digits;
    }
    public static boolean isDuckNumber(int[] digits){
        for (int digit : digits) {
            if (digit != 0) {
                return true; 
            }
        }
     return false;
    }

    //Armstrong number
    public static boolean isArmstrongNumber(int[] digits) {
        int n = digits.length, sum = 0;
      for (int digit : digits) {
            sum += Math.pow(digit, n);
        }
		
          int originalNumber = 0;
        for (int digit : digits) {
            originalNumber = originalNumber * 10 + digit;
        }
      return sum == originalNumber;
    }

   
    public static int[] findLargestTwo(int[] digits){
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int digit : digits) {
            if (digit > largest) {
                secondLargest = largest;
                largest = digit;
            } 
			else if (digit > secondLargest && digit != largest){
                secondLargest = digit;
         }
        }
        return new int[]{largest, secondLargest};
    }

    // Method to find smallest and second smallest 
    public static int[] findSmallestTwo(int[] digits){
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for (int digit : digits) {
            if (digit < smallest) {
                secondSmallest = smallest;
                smallest = digit;
            }
			else if (digit < secondSmallest && digit != smallest){
                secondSmallest = digit;
           }
        }
        return new int[]{smallest, secondSmallest};
    }
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println("Number: " + number);

      
        int digitCount = countDigits(number);
        System.out.println("Count of digits: " + digitCount);

       int[] digitsArray = getDigitsArray(number);
        System.out.println("Digits array: " + Arrays.toString(digitsArray));

        boolean isDuck = isDuckNumber(digitsArray);
           System.out.println("Is Duck Number? " + isDuck);

     
          boolean isArmstrong = isArmstrongNumber(digitsArray);
        System.out.println("Is Armstrong Number? " + isArmstrong);

       
        int[] largestTwo = findLargestTwo(digitsArray);
          System.out.println("Largest: " + largestTwo[0] + ", Second Largest: " + largestTwo[1]);

        // Find smallest and second smallest 
        int[] smallestTwo = findSmallestTwo(digitsArray);
		
         System.out.println("Smallest: " + smallestTwo[0] + ", Second Smallest: " + smallestTwo[1]);
    }
	}