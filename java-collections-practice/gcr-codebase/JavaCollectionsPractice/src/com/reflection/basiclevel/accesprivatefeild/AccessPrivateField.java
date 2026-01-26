package com.reflection.basiclevel.accesprivatefeild;
import java.lang.reflect.Field;

public class AccessPrivateField {

    public static void main(String[] args) {

  try {  Person person = new Person(25);
         Class<?> cls = person.getClass();

        Field ageField = cls.getDeclaredField("age");
            ageField.setAccessible(true);
            //Get value
            int ageValue = (int) ageField.get(person);
            System.out.println("Original Age: " + ageValue);

            //Modify value
            ageField.set(person, 30);

            //Get updated value
            int updatedAge = (int) ageField.get(person);
            System.out.println("Updated Age: " + updatedAge);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}