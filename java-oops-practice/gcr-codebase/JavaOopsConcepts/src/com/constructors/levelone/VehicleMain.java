package com.constructors.levelone;

public class VehicleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Vehicle v1 = new Vehicle("Priyanshu", "Car");
        Vehicle v2 = new Vehicle("Amit", "Bike");

        v1.displayVehicleDetails();
        v2.displayVehicleDetails();

        Vehicle.updateRegistrationFee(2000.0);
        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
	}

}
