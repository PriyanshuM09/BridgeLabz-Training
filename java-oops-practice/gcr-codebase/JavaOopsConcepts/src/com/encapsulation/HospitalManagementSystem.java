package com.encapsulation;

public class HospitalManagementSystem {
    public static void main(String[] args) {

        Patient[] patients = new Patient[2];

        patients[0] = new InPatient(101, "Priyanshu", 22, 5, 3000);
        patients[1] = new OutPatient(102, "Amit", 30, 800);

        for (Patient p : patients) {

            p.getPatientDetails();
            System.out.println("Bill Amount: " + p.calculateBill());

            MedicalRecord record = (MedicalRecord) p;
            record.addRecord("General Checkup");
            record.viewRecords();

            System.out.println();
        }
    }
}

