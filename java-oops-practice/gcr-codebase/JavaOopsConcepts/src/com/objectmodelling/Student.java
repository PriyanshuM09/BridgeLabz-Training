package com.objectmodelling;
import java.util.*;
public class Student {
	   private int id;
	    private String name;
	    private List<Course> courses;

	    public Student(int id, String name) {
	        this.id = id;
	        this.name = name;
	        this.courses = new ArrayList<>();
	    }

	    public void enrollCourse(Course course) {
	        courses.add(course);
	        course.addStudent(this);
	    }

	    public void showCourses() {
	        System.out.println(name + " is enrolled in:");
	        for (Course c : courses) {
	            System.out.println("- " + c.getCourseName());
	        }
	    }

	    public String getName() {
	        return name;
	    }
}
