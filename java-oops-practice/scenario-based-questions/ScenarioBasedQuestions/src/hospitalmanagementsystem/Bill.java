package com.hospitalmanagementsystem;


class Bill implements Payable {
    private Patient patient;
    private double discount;

    public Bill(Patient patient, double discount) {
        this.patient = patient;
        this.discount = discount;
    }

    @Override
    public double calculatePayment() {
        double amount = patient.calculateBill();
        return amount - calculateDiscount(amount);
    }


    private double calculateDiscount(double amount) {
        return amount * discount / 100;
    }
}
