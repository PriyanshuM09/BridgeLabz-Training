package com.hospitalmanagementsystem;

abstract class Patient {
    private int patientId;
    private String name;
    private int age;
    private String medicalHistory;

    public Patient(int patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.medicalHistory = "";
    }

    public int getPatientId() { return patientId; }
    public String getName() { return name; }
    public int getAge() { return age; }
    protected String getMedicalHistory() { return medicalHistory; }
    public void addMedicalHistory(String record) {
        medicalHistory += record + "; ";
    }

    public void getSummary() {
        System.out.println("Patient: " + name + " (ID: " + patientId + ")");
        System.out.println("Medical History: " + medicalHistory);
    }


    public abstract double calculateBill();
}



