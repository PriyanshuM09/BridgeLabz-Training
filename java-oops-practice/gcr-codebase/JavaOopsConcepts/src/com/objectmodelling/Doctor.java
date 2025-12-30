package com.objectmodelling;
import java.util.*;
public class Doctor {
	  private String doctorName;
	    private ArrayList<Patient> patients;

	    public Doctor(String doctorName) {
	        this.doctorName = doctorName;
	        patients = new ArrayList<>();
	    }

	    // Communication method
	    public void consult(Patient patient) {
	        patients.add(patient);
	        System.out.println("Doctor " + doctorName +
	                " is consulting Patient " + patient.getPatientName());
	    }
}
