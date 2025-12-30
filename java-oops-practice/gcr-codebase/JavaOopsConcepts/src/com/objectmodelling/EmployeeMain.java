package com.objectmodelling;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Company company = new Company("Tech Solutions Pvt Ltd");

        Department d1 = new Department("IT");
        d1.addEmployee(1, "Rahul");
        d1.addEmployee(2, "Anita");

        Department d2 = new Department("HR");
        d2.addEmployee(3, "Amit");

        company.addDepartment(d1);
        company.addDepartment(d2);

        company.showCompanyDetails();

        // When company object is destroyed, departments & employees are also destroyed
        company = null;
        System.out.println("\nCompany deleted. All departments and employees are removed.");
	}

}
