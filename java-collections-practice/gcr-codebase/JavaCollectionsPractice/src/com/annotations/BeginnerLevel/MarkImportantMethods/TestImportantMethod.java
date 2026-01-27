package com.annotations.BeginnerLevel.MarkImportantMethods;
import java.lang.reflect.Method;
public class TestImportantMethod {
    public static void main(String[] args) {
        Class cls = ServiceManager.class;
        Method[] methods = cls.getDeclaredMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(ImportantMethod.class)) {
          ImportantMethod im = method.getAnnotation(ImportantMethod.class);

                System.out.println("Method Name: " + method.getName());
                System.out.println("Importance Level: " + im.level());
               
            }
        }
    }
}
