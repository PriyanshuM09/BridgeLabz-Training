package com.FoodFest;
import java.util.Scanner;

public class FoodFest {
	 public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter number of stalls: ");
	        int n = sc.nextInt();
	        sc.nextLine();

	        Stall[] stalls = new Stall[n];

	        for (int i = 0; i < n; i++) {
	            System.out.print("Enter stall name: ");
	            String name = sc.nextLine();

	            System.out.print("Enter footfall count: ");
	            int count = sc.nextInt();
	            sc.nextLine();

	            stalls[i] = new Stall(name, count);
	        }

	        MergeSorter sorter = new MergeSorter();
	        sorter.sort(stalls, 0, stalls.length - 1);

	        System.out.println("Sorted Stall Performance:");
	        for (Stall s : stalls) {
	            s.display();
	        }
	    }
}
