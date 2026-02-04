package com.designpattern.smartuniversitylibrarymanagementsystem;

public class Student implements User {
    public void getRole() {
        System.out.println("Student: Limited borrowing");
    }
}