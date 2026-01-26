package com.reflection.intermediatelevel.accessandmodifystaticfields;
import java.lang.reflect.Field;

public class ModifyStaticField {

    public static void main(String[] args) {
    try { Class<?> cls = Configuration.class;
            Field field = cls.getDeclaredField("API_KEY");

            field.setAccessible(true);

            String originalKey = (String) field.get(null);
            System.out.println("Original API_KEY: " + originalKey);

            field.set(null, "NEW_SECRET_KEY");

            String updatedKey = (String) field.get(null);
            System.out.println("Updated API_KEY: " + updatedKey);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}