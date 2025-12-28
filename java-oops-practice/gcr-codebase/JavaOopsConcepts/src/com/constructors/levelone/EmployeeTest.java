package com.constructors.levelone;

public class EmployeeTest{

	public static void main(String[] args){
		// TODO Auto-generated method stub
		Employee emp= new Employee(101, "IT", 40000);
	        System.out.println("Salary: " + emp.getSalary());
	    emp.setSalary(45000);
	        System.out.println("Updated Salary: " + emp.getSalary());
	        System.out.println();

	    Manager mgr= new Manager(201, "HR", 60000);
	        mgr.displayDetails();
	}

}
