package com.annotations.AdvancedLevel.SerializationAnnotation;

public class User {

    @JsonField(name = "user_name")
    private String username;

    @JsonField(name = "user_email")
    private String email;

    private int age;   // Not serialized (no annotation)

    public User(String username, String email, int age) {
        this.username = username;
        this.email = email;
        this.age = age;
    }
}
