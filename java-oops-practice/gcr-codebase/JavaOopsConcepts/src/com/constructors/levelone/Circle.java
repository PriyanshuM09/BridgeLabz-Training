package com.constructors.levelone;

public class Circle {
	 double radius;

	    // Default Constructor
	    Circle(){
	        this(1.0);   
	    }

	    // Parameterized Constructor
	    Circle(double radius){
	        this.radius = radius;
	    }

	    void displayRadius(){
	        System.out.println("Radius: " + radius);
	    }

}
