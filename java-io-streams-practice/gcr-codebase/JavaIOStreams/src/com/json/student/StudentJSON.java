package com.json.student;

import org.json.JSONArray;
import org.json.JSONObject;

public class StudentJSON {

    public static void main(String[] args) {

        JSONObject student = new JSONObject();

        student.put("name", "Priyanshu");
        student.put("age", 21);

        JSONArray subjects = new JSONArray();
        subjects.put("Java");
        subjects.put("DSA");
        subjects.put("DBMS");

        student.put("subjects", subjects);

        System.out.println(student.toString(4));
    }
}

