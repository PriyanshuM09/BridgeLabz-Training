package com.constructors.levelone;

public class Person{
	 String name;
	 int age;

	    // Parameterized Constructor
	Person(String name, int age){
	        this.name = name;
	        this.age = age;
	    }

	 // Copy Constructor
	Person(Person p){
	        this.name = p.name;
	        this.age = p.age;
	    }

	    void displayDetails(){
	        System.out.println("Name: " + name);
	        System.out.println("Age: " + age);
	        System.out.println();
	    }
}
