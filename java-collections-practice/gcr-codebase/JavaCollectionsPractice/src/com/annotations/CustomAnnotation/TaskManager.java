package com.annotations.CustomAnnotation;
import java.lang.reflect.Method;
public class TaskManager {
    public static void main(String[] args) {

        try {
            Class cls = TaskManager.class;
            Method method = cls.getMethod("completeTask");
            TaskInfo taskInfo = method.getAnnotation(TaskInfo.class);
            System.out.println("Priority: " + taskInfo.priority());
            System.out.println("Assigned To: " + taskInfo.assignedTo());
            } 
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
