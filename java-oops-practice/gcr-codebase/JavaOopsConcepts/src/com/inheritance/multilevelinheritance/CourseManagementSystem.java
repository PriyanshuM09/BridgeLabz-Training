package com.inheritance.multilevelinheritance;

public class CourseManagementSystem {
    public static void main(String[] args) {

        Course c1 = new Course("C Programming", 6);
        Course c2 = new OnlineCourse("Java Basics", 8, "Coursera", true);
        Course c3 = new PaidOnlineCourse(
                "Advanced Java", 10, "Udemy", true, 5000, 20
        );

        System.out.println("Course 1 Details:");
        c1.displayInfo();

        System.out.println("\nCourse 2 Details:");
        c2.displayInfo();

        System.out.println("\nCourse 3 Details:");
        c3.displayInfo();
    }
}

