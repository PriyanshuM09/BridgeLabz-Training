package com.FoodFest;

public class Stall {
	   String stallName;
	    int footfall;

	    Stall(String stallName, int footfall) {
	        this.stallName = stallName;
	        this.footfall = footfall;
	    }

	    void display() {
	        System.out.println(stallName + " - " + footfall);
	    }
}
