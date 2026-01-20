package com.EduResults;

public class RankDisplay {
	// Added method for rank display
    public void show(int[] marks) {
        for (int m : marks) {
            System.out.print(m + " ");
        }
        System.out.println();
    }
}
