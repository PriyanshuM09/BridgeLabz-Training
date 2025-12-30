package com.objectmodelling;
import java.util.*;
public class Department {
	   private String deptName;
	    private List<Employee> employees;

	    public Department(String deptName) {
	        this.deptName = deptName;
	        this.employees = new ArrayList<>();
	    }

	    public void addEmployee(int id, String name) {
	        Employee emp = new Employee(id, name);
	        employees.add(emp);
	    }

	    public void showEmployees() {
	        System.out.println("Department: " + deptName);
	        for (Employee e : employees) {
	            e.showEmployee();
	        }
	    }
}
