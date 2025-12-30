package com.objectmodelling;
import java.util.*;
public class University {
	   private String universityName;
	    private ArrayList<DepartmentD1> departments;
	    private ArrayList<Faculty> faculties;

	    public University(String universityName) {
	        this.universityName = universityName;
	        departments = new ArrayList<>();
	        faculties = new ArrayList<>();
	    }

	    // Composition: University owns DepartmentD1
	    public void addDepartment(String deptName) {
	        departments.add(new DepartmentD1(deptName));
	    }

	    // Aggregation: Faculty exists independently
	    public void addFaculty(Faculty faculty) {
	        faculties.add(faculty);
	    }

	    public void showUniversityDetails() {
	        System.out.println("University: " + universityName);

	        System.out.println("Departments:");
	        for (DepartmentD1 d : departments) {
	            d.showDepartment();
	        }

	        System.out.println("Faculties:");
	        for (Faculty f : faculties) {
	            f.showFaculty();
	        }
	    }
}
