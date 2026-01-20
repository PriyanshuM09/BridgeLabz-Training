package com.FoodFest;

public class MergeSorter {
	 public void sort(Stall[] arr, int left, int right) {
	        if (left < right) {
	            int mid = (left + right) / 2;

	            sort(arr, left, mid);
	            sort(arr, mid + 1, right);

	            merge(arr, left, mid, right);
	        }
	    }

	    private void merge(Stall[] arr, int left, int mid, int right) {
	        int n1 = mid - left + 1;
	        int n2 = right - mid;

	        Stall[] L = new Stall[n1];
	        Stall[] R = new Stall[n2];

	        for (int i = 0; i < n1; i++)
	            L[i] = arr[left + i];

	        for (int j = 0; j < n2; j++)
	            R[j] = arr[mid + 1 + j];

	        int i = 0, j = 0, k = left;

	        while (i < n1 && j < n2) {
	            if (L[i].footfall >= R[j].footfall) {
	                arr[k++] = L[i++];
	            } else {
	                arr[k++] = R[j++];
	            }
	        }

	        while (i < n1)
	            arr[k++] = L[i++];

	        while (j < n2)
	            arr[k++] = R[j++];
	    }
}
