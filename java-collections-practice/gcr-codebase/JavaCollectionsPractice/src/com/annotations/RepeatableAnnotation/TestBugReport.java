package com.annotations.RepeatableAnnotation;

import java.lang.reflect.Method;

public class TestBugReport {
    public static void main(String[] args) {
        try {
            Class cls = BugTracker.class;
            Method method = cls.getMethod("processBug");
            BugReport[] bugReports = method.getAnnotationsByType(BugReport.class);
            for (BugReport bug : bugReports) {
                System.out.println("Bug Description: " + bug.description());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
