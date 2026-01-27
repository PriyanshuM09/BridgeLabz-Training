package com.annotations.RepeatableAnnotation;

public class BugTracker {

    @BugReport(description = "NullPointerException on login")
    @BugReport(description = "UI alignment issue on dashboard")
    public void processBug() {
        System.out.println("Processing bugs...");
    }
}

