package com.inheritance;

public class Manager extends Employee {
	int teamSize;
	
   public Manager(String name, int id,int salary,int teamSize ) {
      	super(name,id,salary);
	    this.teamSize=teamSize;
  }
   
   public void displayDetails() {
	   super.displayDetails();
	   System.out.println(" TeamSize is : "+teamSize);
   }
}
