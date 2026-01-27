package com.annotations.AdvancedLevel.SerializationAnnotation;

public class TestJsonSerialization {

    public static void main(String[] args) throws Exception {

        User user = new User( "priyanshu","priyanshu@gmail.com",22);
        String json = JsonSerializer.toJson(user);
        System.out.println(json);
    }
}
