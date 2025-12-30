package com.objectmodelling;
import java.util.*;
public class Course {
	 private String courseName;
	    private List<Student> students;

	    public Course(String courseName) {
	        this.courseName = courseName;
	        this.students = new ArrayList<>();
	    }

	    public void addStudent(Student student) {
	        students.add(student);
	    }

	    public void showStudents() {
	        System.out.println("Students enrolled in " + courseName + ":");
	        for (Student s : students) {
	            System.out.println("- " + s.getName());
	        }
	    }

	    public String getCourseName() {
	        return courseName;
	    }
}
