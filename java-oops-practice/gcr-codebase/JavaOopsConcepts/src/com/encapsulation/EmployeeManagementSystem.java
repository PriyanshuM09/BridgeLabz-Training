package com.encapsulation;

public class EmployeeManagementSystem {
    public static void main(String[] args) {

        Employee[] employees = new Employee[2];

        employees[0] = new FullTimeEmployee(101, "Priyanshu", 50000);
        employees[1] = new PartTimeEmployee(102, "Amit", 500, 40);

        ((Department) employees[0]).assignDepartment("IT");
        ((Department) employees[1]).assignDepartment("Support");

        for (Employee emp : employees) {
            emp.displayDetails();
            System.out.println("Department: " +
                    ((Department) emp).getDepartmentDetails());
            System.out.println();
        }
    }
}
