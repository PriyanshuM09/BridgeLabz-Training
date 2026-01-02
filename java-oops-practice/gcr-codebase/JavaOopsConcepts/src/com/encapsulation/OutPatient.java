package com.encapsulation;

public class OutPatient extends Patient implements MedicalRecord {

    private double consultationFee;
    private String diagnosis;

    public OutPatient(int patientId, String name, int age,
                      double consultationFee) {
        super(patientId, name, age);
        this.consultationFee = consultationFee;
    }

    @Override
    public double calculateBill() {
        return consultationFee;
    }

    @Override
    public void addRecord(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    @Override
    public void viewRecords() {
        System.out.println("Diagnosis: " + diagnosis);
    }
}

