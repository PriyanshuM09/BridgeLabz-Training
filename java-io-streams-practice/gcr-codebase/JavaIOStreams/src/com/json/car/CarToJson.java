package com.json.car;

import com.fasterxml.jackson.databind.ObjectMapper;

public class CarToJson {

    public static void main(String[] args) {
        try {
            Car car = new Car("BMW", "X5", 2023);
            ObjectMapper mapper = new ObjectMapper();
            String json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(car);

            System.out.println(json);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
