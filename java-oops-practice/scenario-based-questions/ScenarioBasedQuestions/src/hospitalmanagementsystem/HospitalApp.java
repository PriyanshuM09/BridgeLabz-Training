package com.hospitalmanagementsystem;

import java.util.*;
	public class HospitalApp {

	    public static void main(String[] args) {
	        List<Patient> patients = new ArrayList<>();

	        InPatient ip = new InPatient(1, "Suyash", 65, 5, 2000);
	        ip.addMedicalHistory("Dengue");
	        OutPatient op = new OutPatient(2, "Amit", 30, 500);
	        op.addMedicalHistory("Routine Checkup");

	        patients.add(ip);
	        patients.add(op);

	        Doctor doc = new Doctor("Dr. Sharma", "Cardiology");
	        doc.displayInfo();

	        for (Patient p : patients) {
	            p.getSummary();

	            double discountPercent = HospitalHelper.checkDiscountEligibility(p) ? 10 : 0;
	            Bill bill = new Bill(p, discountPercent);
	            System.out.println("Total Bill: " + bill.calculatePayment());
	     }
	    }
	     }



