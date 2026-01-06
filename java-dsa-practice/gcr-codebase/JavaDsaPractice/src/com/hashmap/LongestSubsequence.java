package com.hashmap;
import java.util.*;
public class LongestSubsequence {
public static int checkLongest(int []arr) {
	HashMap<Integer,Integer>map=new HashMap<>();
	int maxLength=0;
	for(int num:arr) {
		if(map.containsKey(num)) {
			continue;
		}
	       int left = map.containsKey(num - 1) ? map.get(num - 1) : 0;
           int right = map.containsKey(num + 1) ? map.get(num + 1) : 0;
           int sum = left + 1 + right;
           map.put(num, sum); 
           if (left>0){
               map.put(num-left, sum);
           }
           if (right>0) {
               map.put(num+right, sum);
           }
           maxLength = Math.max(maxLength, sum);
          }
       return maxLength;
           }

   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int[] arr = new int[n];
 
       for (int i=0;i<n;i++) {
           arr[i]=sc.nextInt();
       }
       int result = checkLongest(arr);
       System.out.println("Length of longest consecutive sequence: " + result);

   }
}
	

