package com.hospitalmanagementsystem;


	public class HospitalHelper {

	    
	    public static boolean validateUserInput(int value) {
	        return value > 0;
	    }

	    
	    public static boolean checkDiscountEligibility(Patient p) {
	        return p.getAge() >= 60;
	    }

	
	    public static double calculateDiscount(double amount, double discountPercent) {
	        return amount * discountPercent / 100;
	    }
	}


