package com.objectmodelling;

public class UniversityManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  University uni = new University("ABC University");

	        // Composition
	        uni.addDepartment("DepartmentD1");
	        uni.addDepartment("DepartmentD1 - Research");

	        // Aggregation
	        Faculty f1 = new Faculty("Dr. Sharma");
	        Faculty f2 = new Faculty("Dr. Mehta");

	        uni.addFaculty(f1);
	        uni.addFaculty(f2);

	        uni.showUniversityDetails();

	        // Deleting University
	        uni = null;
	        System.out.println("\nUniversity deleted. Departments are also deleted.");

	        // Faculty still exists
	        f1.showFaculty();
	}

}
