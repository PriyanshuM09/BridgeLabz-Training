package com.csvdatahandling.columnrecords;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
public class ColumnRecords {

	    static class Employee {
	        int id;
	        String name;
	        String department;
	        double salary;

	        Employee(int id, String name, String department, double salary) {
	            this.id=id;
	            this.name=name;
	            this.department=department;
	            this.salary=salary;
	        }
	    }
	    public static void main(String[] args) {

	        String filePath="employees.csv";
	        List<Employee>employees=new ArrayList<Employee>();
	        String line;
	        try {
	            BufferedReader br=new BufferedReader(new FileReader(filePath));
	            br.readLine();

	            while ((line=br.readLine())!=null) {
	                String[] data=line.split(",");
	                int id=Integer.parseInt(data[0]);
	                String name=data[1];
	                String department=data[2];
	                double salary=Double.parseDouble(data[3]);

	                employees.add(new Employee(id, name, department, salary));
	            }
	            br.close();

	        } 
	        catch (IOException e) {
	            e.printStackTrace();
	        }
	        Collections.sort(employees, new Comparator<Employee>() {
	            public int compare(Employee e1, Employee e2) {
	                return Double.compare(e2.salary, e1.salary);
	            }
	        });
	        System.out.println("Top 5 Highest Paid Employees:");

	        for (int i=0;i<employees.size()&&i<5;i++) {
	            Employee e=employees.get(i);
	            System.out.println("ID         : " + e.id);
	            System.out.println("Name       : " + e.name);
	            System.out.println("Department : " + e.department);
	            System.out.println("Salary     : " + e.salary);
	        }
	    }
	}
