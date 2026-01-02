package com.hospitalmanagementsystem;
class InPatient extends Patient {
    private int daysAdmitted;
    private double dailyCharge;

    public InPatient(int id, String name, int age, int days, double dailyCharge) {
        super(id, name, age);
        this.daysAdmitted = days;
        this.dailyCharge = dailyCharge;
    }

    @Override
    public double calculateBill() {
        return daysAdmitted * dailyCharge;
    }
}

class OutPatient extends Patient {
    private double consultationFee;

    public OutPatient(int id, String name, int age, double fee) {
        super(id, name, age);
        this.consultationFee = fee;
    }

    @Override
    public double calculateBill() {
        return consultationFee;
    }
}



