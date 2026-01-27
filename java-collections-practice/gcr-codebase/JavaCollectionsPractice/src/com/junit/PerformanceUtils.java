package com.junit;
public class PerformanceUtils {
    public String longRunningTask() {
        try {
            Thread.sleep(3000); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "Task Completed";
    }
}
