package com.GamerZone;

public class QuickSorter {
	    public void sort(Player[] arr, int low, int high) {
	        if (low < high) {
	            int p = partition(arr, low, high);
	            sort(arr, low, p - 1);
	            sort(arr, p + 1, high);
	        }
	    }

	    private int partition(Player[] arr, int low, int high) {
	        Player pivot = arr[high];
	        int i = low - 1;

	        for (int j = low; j < high; j++) {
	            if (arr[j].score >= pivot.score) {
	                i++;
	                Player temp = arr[i];
	                arr[i] = arr[j];
	                arr[j] = temp;
	            }
	        }

	        Player temp = arr[i + 1];
	        arr[i + 1] = arr[high];
	        arr[high] = temp;

	        return i + 1;
	    }
	}


