package com.annotations.IntermediateLevel.LoggingMethod;

public class ExecutionService {

    @LogExecutionTime
    public void quickMethod() {
        for (int i = 0; i < 1000; i++) {
            // fast execution
        }
    }
    @LogExecutionTime
    public void slowMethod() {
        for (int i = 0; i < 1000000; i++) {
            // slow execution
        }
    }
    public void normalMethod() {
        System.out.println("Normal method (no logging)");
    }
}

