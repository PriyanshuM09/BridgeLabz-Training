package com.inheritance;

public class Developer extends Employee{

	String programmingLang;
	public Developer(String name, int id,int salary,String programmingLang) {
		super(name,id,salary);
		this.programmingLang=programmingLang;
	}
	
	public void displayDetails() {
		   super.displayDetails();
		   System.out.println(" programmingLanguage is : "+programmingLang);
	}
}
