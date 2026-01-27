package com.annotations.BeginnerLevel.Todo;

public class ProjectService {
    @Todo(
        task = "Implement payment gateway",
        assignedTo = "Priyanshu",
        priority = "HIGH"
    )
    public void paymentFeature() {
        System.out.println("Payment feature pending...");
    }
    @Todo(
        task = "Add email notification service",
        assignedTo = "Amit"
    )
    public void notificationFeature() {
        System.out.println("Notification feature pending...");
    }
    @Todo(
        task = "Improve logging mechanism",
        assignedTo = "Riya",
        priority = "LOW"
    )
    public void loggingFeature() {
        System.out.println("Logging improvement pending...");
    }
    public void completedFeature() {
        System.out.println("Already completed feature.");
    }
}
