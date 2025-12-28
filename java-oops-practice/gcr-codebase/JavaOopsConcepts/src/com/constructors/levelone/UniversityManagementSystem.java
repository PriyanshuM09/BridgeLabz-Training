package com.constructors.levelone;

public class UniversityManagementSystem{


	// TODO Auto-generated method stub
		  public static void main(String[] args){

	Student s1 = new Student(101, "Priyanshu", 8.5);
	 s1.displayStudent();
	 s1.setCGPA(8.9);
	System.out.println("Updated CGPA: " + s1.getCGPA());

	  System.out.println();

	 PostgraduateStudent pg = new PostgraduateStudent(201, "Aman", 9.1, "Computer Science");
	  pg.displayPGStudent();
		    }
	}

