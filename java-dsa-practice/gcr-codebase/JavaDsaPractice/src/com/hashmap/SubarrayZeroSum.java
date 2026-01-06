package com.hashmap;

import java.util.*;
public class SubarrayZeroSum {

    public static void findZeroSumSubarrays(int[] arr) {
        Map<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>();
        int prefixSum = 0;
        List<Integer> list = new ArrayList<Integer>();
        list.add(-1);
        map.put(0, list);

        for (int i=0;i<arr.length; i++) {
            prefixSum += arr[i];
            if (map.containsKey(prefixSum)) {
                List<Integer> indices = map.get(prefixSum);
                for (int j = 0; j < indices.size(); j++) {
                    int startIndex = indices.get(j);
                    System.out.println("Zero-sum subarray found from index "+ (startIndex + 1) + " to " + i);
                }
                }

            if (!map.containsKey(prefixSum)) {
                map.put(prefixSum, new ArrayList<Integer>());
            }
            map.get(prefixSum).add(i);
     }
    }

	    public static void main(String[] args) {
	        Scanner sc=new Scanner(System.in);
	        int n = sc.nextInt();
	        int[] arr = new int[n];
	        for(int i =0; i<n;i++) {
	            arr[i]=sc.nextInt();
	        }
	        findZeroSumSubarrays(arr);
	 }
	}



