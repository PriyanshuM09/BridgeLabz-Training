package com.inheritance;

public class Intern extends Employee{
int durationDays;

public Intern(String name, int id,int salary,int durationDays) {
	super(name,id,salary);
	this.durationDays=durationDays;
}

public void displayDetails() {
	super.displayDetails();
	System.out.println("Intern duration in days " +durationDays);
}
}
