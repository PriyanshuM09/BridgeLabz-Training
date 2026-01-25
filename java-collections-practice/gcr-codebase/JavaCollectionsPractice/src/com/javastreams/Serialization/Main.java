package com.javastreams.Serialization;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "Priyanshu", "IT", 45000));
        employees.add(new Employee(2, "Aman", "HR", 40000));
        employees.add(new Employee(3, "Riya", "Finance", 50000));
        serializeEmployees(employees);
        deserializeEmployees();
    }
    static void serializeEmployees(List<Employee> employees) {
        try(ObjectOutputStream oos =new ObjectOutputStream(new FileOutputStream("employees.dat"))) {
            oos.writeObject(employees);
            System.out.println("Employees saved successfully.");
        }
        catch (IOException e) {
            System.out.println("Error while saving employees.");
        }
    }
    static void deserializeEmployees() {
        try(ObjectInputStream ois =  new ObjectInputStream(new FileInputStream("employees.dat"))) {
        List<Employee> employees =(List<Employee>) ois.readObject();

     for(Employee e : employees) { System.out.println( e.id + " " + e.name + " " +e.department + " " +e.salary);
            }
        } 
        catch(IOException e) {
            System.out.println("Error while reading employees.");
        }
        catch (ClassNotFoundException e) {
            System.out.println("Class not found.");
        }
    }
}
