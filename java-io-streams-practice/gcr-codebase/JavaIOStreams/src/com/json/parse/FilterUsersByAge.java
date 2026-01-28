package com.json.parse;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.InputStream;
import java.util.Iterator;

public class FilterUsersByAge {

    public static void main(String[] args) {
        try {
            ObjectMapper mapper = new ObjectMapper();

            InputStream is = FilterUsersByAge.class
                    .getClassLoader()
                    .getResourceAsStream("users.json");

            if (is == null) {
                throw new RuntimeException("users.json not found");
            }
            JsonNode rootNode = mapper.readTree(is);
            System.out.println("Users with age > 25:");
            Iterator<JsonNode> iterator = rootNode.elements();
            while (iterator.hasNext()) {
                JsonNode user = iterator.next();

                if (user.has("age") && user.get("age").asInt() > 25) {
                    System.out.println(user);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

