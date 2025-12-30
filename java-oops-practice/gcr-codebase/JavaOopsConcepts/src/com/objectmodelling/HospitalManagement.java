package com.objectmodelling;

public class HospitalManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Hospital hospital = new Hospital("City Hospital");

	        Doctor d1 = new Doctor("Dr. Sharma");
	        Doctor d2 = new Doctor("Dr. Mehta");

	        Patient p1 = new Patient("Rahul");
	        Patient p2 = new Patient("Anita");

	        hospital.addDoctor(d1);
	        hospital.addDoctor(d2);

	        hospital.addPatient(p1);
	        hospital.addPatient(p2);

	        hospital.showHospitalDetails();
	        System.out.println();

	        // Association & communication
	        d1.consult(p1);
	        d1.consult(p2);
	        d2.consult(p1);
	}

}
