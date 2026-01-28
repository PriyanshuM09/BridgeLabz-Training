package com.json.schema;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.networknt.schema.JsonSchema;
import com.networknt.schema.JsonSchemaFactory;
import com.networknt.schema.SpecVersion;
import com.networknt.schema.ValidationMessage;

import java.io.InputStream;
import java.util.Set;

public class ValidateEmailUsingSchema {

    public static void main(String[] args) {
        try {
            ObjectMapper mapper = new ObjectMapper();

            InputStream jsonStream = ValidateEmailUsingSchema.class
                    .getClassLoader()
                    .getResourceAsStream("user.json");

            InputStream schemaStream = ValidateEmailUsingSchema.class
                    .getClassLoader()
                    .getResourceAsStream("user-schema.json");

            if (jsonStream == null || schemaStream == null) {
                throw new RuntimeException("JSON or Schema file not found");
            }

            JsonNode jsonNode = mapper.readTree(jsonStream);

            JsonSchemaFactory factory =
                    JsonSchemaFactory.getInstance(SpecVersion.VersionFlag.V7);

            JsonSchema schema = factory.getSchema(schemaStream);

            Set<ValidationMessage> errors = schema.validate(jsonNode);

            if (errors.isEmpty()) {
                System.out.println(" Email is valid according to JSON Schema");
            } else {
                System.out.println(" Validation errors:");
                errors.forEach(e -> System.out.println(e.getMessage()));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
