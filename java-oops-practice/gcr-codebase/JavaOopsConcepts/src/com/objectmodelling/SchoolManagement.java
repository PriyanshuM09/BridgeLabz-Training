package com.objectmodelling;

public class SchoolManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  School school = new School("ABC Public School");

	        Student s1 = new Student(1, "Rahul");
	        Student s2 = new Student(2, "Anita");

	        Course c1 = new Course("Java");
	        Course c2 = new Course("Mathematics");

	        // Aggregation
	        school.addStudent(s1);
	        school.addStudent(s2);

	        // Association (Many-to-Many)
	        s1.enrollCourse(c1);
	        s1.enrollCourse(c2);
	        s2.enrollCourse(c1);

	        school.showStudents();
	        System.out.println();

	        s1.showCourses();
	        System.out.println();

	        c1.showStudents();
	}

}
