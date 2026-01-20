package com.MovieTime;

public class InsertionSorter {
	 public void sort(Show[] shows) {
	        for (int i = 1; i < shows.length; i++) {
	            Show key = shows[i];
	            int j = i - 1;

	            while (j >= 0 && shows[j].time > key.time) {
	                shows[j + 1] = shows[j];
	                j--;
	            }

	            shows[j + 1] = key;
	        }
	  }
}
