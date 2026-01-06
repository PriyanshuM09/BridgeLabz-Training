package com.hashmap;
import java.util.*;
public class PairSumArray {

	public static boolean findPairSumArray(int arr[],int target) {
		HashMap<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			int current=arr[i];
			int required=target-current;
		
			if(map.containsKey(required)) {
				System.out.println("pair found "+ required + "+ "+current +
						" =" + target);
			return true;
		}
		map.put(current, i);
		}
	return false;
	
	}
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int target =sc.nextInt();
		boolean result=findPairSumArray(arr,target);
		if(!result) {
			System.out.println("no pair found");
		}
	}
}
