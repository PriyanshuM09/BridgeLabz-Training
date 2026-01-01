package com.inheritance;

public class EmployeeManagementSystem {

	public static void main(String[] args) {

        Employee e1 = new Manager("Amit",11,80000,5);
        Employee e2 = new Developer("Priyanshu",12,50000,"java");
        Employee e3 = new Intern("Raj",13,35000,120);

        System.out.println("Manager Details:");
        e1.displayDetails();

        System.out.println("\nDeveloper Details:");
        e2.displayDetails();

        System.out.println("\nIntern Details:");
        e3.displayDetails();
	}

}
