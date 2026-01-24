package com.collections.mapinterface;

import java.util.*;

public class GroupEmployeesByDepartment {

    String name;
    String department;

 GroupEmployeesByDepartment(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public static void main(String[] args) {

      List<GroupEmployeesByDepartment> employees = new ArrayList<>();
        employees.add(new GroupEmployeesByDepartment("Alice", "HR"));
        employees.add(new GroupEmployeesByDepartment("Bob", "IT"));
        employees.add(new GroupEmployeesByDepartment("Carol", "HR"));

      Map<String, List<GroupEmployeesByDepartment>> map = new HashMap<>();

     for(GroupEmployeesByDepartment emp : employees) {
            String dept = emp.department;
     if(map.containsKey(dept)) {
                map.get(dept).add(emp);
       } 
        else{
                List<GroupEmployeesByDepartment> list = new ArrayList<>();
                list.add(emp);
                map.put(dept, list);
            }
        }
        for (Map.Entry<String, List<GroupEmployeesByDepartment>> entry : map.entrySet()) {
            System.out.print(entry.getKey() + ": ");
            for (GroupEmployeesByDepartment e : entry.getValue()) {
                System.out.print(e.name + " ");
            }
            System.out.println();
        }
    }
}
