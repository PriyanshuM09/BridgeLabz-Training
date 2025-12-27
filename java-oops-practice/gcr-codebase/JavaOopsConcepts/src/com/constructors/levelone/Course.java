package com.constructors.levelone;

public class Course {
    String courseName;
    int duration;     
    double fee;

    static String instituteName = "BridgeLabz";

    // Parameterized Constructor
    Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    void displayCourseDetails() {
        System.out.println("Institute Name : " + instituteName);
        System.out.println("Course Name : " + courseName);
        System.out.println("Duration   : " + duration + " weeks");
        System.out.println("Fee   : " + fee);
        System.out.println();
    }
    static void updateInstituteName(String newInstituteName) {
        instituteName = newInstituteName;
    }
}
