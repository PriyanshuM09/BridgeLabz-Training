package com.annotations.BeginnerLevel.MarkImportantMethods;
public class ServiceManager {
    @ImportantMethod
    public void processPayment() {
        System.out.println("Processing payment...");
    }
    @ImportantMethod(level = "MEDIUM")
    public void generateReport() {
        System.out.println("Generating report...");
    }
    public void helperMethod() {
        System.out.println("Helper method (not important).");
    }
}
