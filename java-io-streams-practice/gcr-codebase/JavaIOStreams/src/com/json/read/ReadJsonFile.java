package com.json.read;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.InputStream;

public class ReadJsonFile {

    public static void main(String[] args) throws Exception {

        ObjectMapper mapper = new ObjectMapper();

        InputStream inputStream =
                ReadJsonFile.class
                        .getClassLoader()
                        .getResourceAsStream("user.json");

        if (inputStream == null) {
            throw new RuntimeException("user.json not found in resources folder");
        }

        System.out.println(mapper.readTree(inputStream));
    }
}
