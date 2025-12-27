package com.constructors.levelone;

public class PersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	       // Original object
		  Person p1 = new Person("Raj", 22);
	   
		   Person p2 = new Person(p1);

		        p1.displayDetails();
		        p2.displayDetails();
	}

}
