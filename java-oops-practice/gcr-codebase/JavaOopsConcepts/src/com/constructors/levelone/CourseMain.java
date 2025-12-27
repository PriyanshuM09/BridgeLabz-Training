package com.constructors.levelone;

public class CourseMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Course c1 = new Course("Core Java", 8, 12000);
	        Course c2 = new Course("Python", 6, 10000);

	        c1.displayCourseDetails();
	        c2.displayCourseDetails();
	        
	     Course.updateInstituteName("BridgeLabz Solutions");

	        c1.displayCourseDetails();
	        c2.displayCourseDetails();
	}

}
