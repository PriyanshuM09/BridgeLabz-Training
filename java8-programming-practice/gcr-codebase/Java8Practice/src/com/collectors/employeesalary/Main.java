package com.collectors.employeesalary;
import java.util.*;
import java.util.stream.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> employees = List.of(
			    new Employee("Amit", "IT", 75000),
			    new Employee("Neha", "HR", 55000),
			    new Employee("Rahul", "IT", 85000),
			    new Employee("Sneha", "Finance", 65000),
			    new Employee("Karan", "HR", 60000)
			);
		Map<String, Double>avgSalaryByDept=employees.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment,
				Collectors.averagingDouble(Employee::getSalary)));
		System.out.println(avgSalaryByDept);
	}

}
