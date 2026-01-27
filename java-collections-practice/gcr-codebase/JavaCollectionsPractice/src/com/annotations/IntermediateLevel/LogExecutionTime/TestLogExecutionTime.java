package com.annotations.IntermediateLevel.LogExecutionTime;

import java.lang.reflect.Method;

public class TestLogExecutionTime {
    public static void main(String[] args) throws Exception {
        PerformanceService service = new PerformanceService();
        Class cls = service.getClass();
        Method[] methods = cls.getDeclaredMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(LogExecutionTime.class)) {
                long startTime = System.nanoTime();
                method.invoke(service);
                long endTime = System.nanoTime();
                long executionTime = endTime - startTime;
      System.out.println("Method: " + method.getName() +" | Execution Time: " + executionTime + " ns");
            }
        }
    }
}

