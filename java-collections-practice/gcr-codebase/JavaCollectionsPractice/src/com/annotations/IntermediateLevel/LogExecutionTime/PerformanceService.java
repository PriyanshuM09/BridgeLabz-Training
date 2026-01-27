package com.annotations.IntermediateLevel.LogExecutionTime;
public class PerformanceService {
    @LogExecutionTime
    public void fastTask() {
        for (int i = 0; i < 1000; i++) {
        }
    }
    @LogExecutionTime
    public void slowTask() {
        for (int i = 0; i < 1000000; i++) {
        }
    }
    public void normalTask() {
        System.out.println("Normal task (not logged)");
    }
}

