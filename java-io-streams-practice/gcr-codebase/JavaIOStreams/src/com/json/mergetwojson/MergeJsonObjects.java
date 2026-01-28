package com.json.mergetwojson;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class MergeJsonObjects {
    public static void main(String[] args) throws Exception {
        ObjectMapper mapper = new ObjectMapper();

        // First JSON object
        ObjectNode json1 = mapper.createObjectNode();
        json1.put("name", "Amit");
        json1.put("age", 24);
        json1.put("city", "Delhi");

        ObjectNode json2 = mapper.createObjectNode();
        json2.put("age", 30);         
        json2.put("country", "India");

        json1.setAll(json2);

        System.out.println("Merged JSON:");
        System.out.println(
                mapper.writerWithDefaultPrettyPrinter()
                      .writeValueAsString(json1)
        );
    }
}
