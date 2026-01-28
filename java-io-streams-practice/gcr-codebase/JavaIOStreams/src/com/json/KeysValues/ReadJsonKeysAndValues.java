package com.json.KeysValues;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.InputStream;
import java.util.Iterator;
import java.util.Map;

public class ReadJsonKeysAndValues {

    public static void main(String[] args) {
        try {
            ObjectMapper mapper = new ObjectMapper();

            InputStream is = ReadJsonKeysAndValues.class
                    .getClassLoader()
                    .getResourceAsStream("data.json");

            if (is == null) {
                throw new RuntimeException("data.json not found");
            }

            JsonNode rootNode = mapper.readTree(is);

            System.out.println("JSON Keys and Values:");
            printJson(rootNode, "");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Recursive method to print all keys and values
    private static void printJson(JsonNode node, String indent) {

        if (node.isObject()) {
            Iterator<Map.Entry<String, JsonNode>> fields = node.fields();
            while (fields.hasNext()) {
                Map.Entry<String, JsonNode> entry = fields.next();
                System.out.println(indent + entry.getKey() + " :");
                printJson(entry.getValue(), indent + "  ");
            }
        } else if (node.isArray()) {
            for (JsonNode item : node) {
                printJson(item, indent + "  ");
            }
        } else {
            System.out.println(indent + node.asText());
        }
    }
}

