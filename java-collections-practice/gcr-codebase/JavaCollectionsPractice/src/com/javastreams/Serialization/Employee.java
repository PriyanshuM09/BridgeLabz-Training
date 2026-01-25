package com.javastreams.Serialization;
import java.io.Serializable;
public class Employee implements Serializable{
  private static final long serialVersionUID = 1L;
    int id;
    String name;
    String department;
    double salary;

   Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
}

