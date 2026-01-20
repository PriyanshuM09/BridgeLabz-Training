

package com.MovieTime;
import java.util.Scanner;
public class MovieTime {
	 public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter number of shows: ");
	        int n = sc.nextInt();
	        sc.nextLine();

	        Show[] shows = new Show[n];

	        for (int i = 0; i < n; i++) {
	            System.out.print("Enter movie name: ");
	            String name = sc.nextLine();

	            System.out.print("Enter show time (24hr format): ");
	            int time = sc.nextInt();
	            sc.nextLine();

	            shows[i] = new Show(name, time);
	        }

	        InsertionSorter sorter = new InsertionSorter();
	        sorter.sort(shows);

	        System.out.println("Sorted Show Timings:");
	        for (Show s : shows) {
	            s.display();
	        }
	    }
}
