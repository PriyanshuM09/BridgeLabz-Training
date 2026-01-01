package com.inheritance;

public class Employee {
    String name;
    int id;
    int salary;
    
    public Employee(String name, int id,int salary) {
    	    this.name=name;
    	    this.id=id;
    	    this.salary=salary;
    }
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
}}
