package com.functionalInterface.multivehicle;

	class Bike implements RentalVehicle {
	    public void rent() {
	        System.out.println("Bike has been rented");
	    }

	    public void returnVehicle() {
	        System.out.println("Bike has been returned");
	    }
	}

