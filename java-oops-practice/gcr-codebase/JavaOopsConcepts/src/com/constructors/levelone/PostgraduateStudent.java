package com.constructors.levelone;

public class PostgraduateStudent extends Student{
	  String specialization;

	    PostgraduateStudent(int rollNumber, String name, double CGPA, String specialization) {
	        super(rollNumber, name, CGPA);
	        this.specialization = specialization;
	    }

	    public void displayPGStudent(){
	 System.out.println("Postgraduate Student Name: " + name); 
	 System.out.println("Specialization: " + specialization);
	    }
}
