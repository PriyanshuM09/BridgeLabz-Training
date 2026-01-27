package com.annotations.IntermediateLevel.LoggingMethod;

import java.lang.reflect.Method;
public class TestLogExecutionTime {
    public static void main(String[] args) throws Exception {
        ExecutionService service = new ExecutionService();
        Class cls = service.getClass();
        Method[] methods = cls.getDeclaredMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(LogExecutionTime.class)) {
                long start = System.nanoTime();
                method.invoke(service);
                long end = System.nanoTime();
                System.out.println("Method: " + method.getName() +" | Execution Time: " + (end - start) + " ns");
            }
        }
    }
}
