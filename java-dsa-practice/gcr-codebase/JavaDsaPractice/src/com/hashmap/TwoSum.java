package com.hashmap;
import java.util.*;
public class TwoSum {
public static int[] findPair(int arr[],int target) {
	HashMap<Integer,Integer> map=new HashMap<>();
	for(int i=0;i<arr.length;i++) {
		int current=arr[i];
		int required=target-current;
		if(map.containsKey(required)) {
			return new int[] {map.get(required),i};
		}
		map.put(current, i);
	}
	return new int[] {-1,-1};
}
public static void main(String []args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int arr[]=new int[n];
	for(int i=0;i<n;i++) {
		arr[i]=sc.nextInt();
	}
	int target=sc.nextInt();
	int result[]=findPair(arr,target);
	   if (result[0] != -1) {
           System.out.println(
               "Indices found: " + result[0] + " and " + result[1]
           );
           System.out.println(
               "Values: " + arr[result[0]] + " + " + arr[result[1]] +
               " = " + target
           );
       } else {
           System.out.println("No valid pair found.");
       }
}
}