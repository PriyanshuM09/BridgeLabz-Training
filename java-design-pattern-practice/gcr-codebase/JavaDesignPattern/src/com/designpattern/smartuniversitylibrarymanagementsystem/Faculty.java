package com.designpattern.smartuniversitylibrarymanagementsystem;

public class Faculty implements User {
    public void getRole() {
        System.out.println("Faculty: Extended borrowing");
    }
}