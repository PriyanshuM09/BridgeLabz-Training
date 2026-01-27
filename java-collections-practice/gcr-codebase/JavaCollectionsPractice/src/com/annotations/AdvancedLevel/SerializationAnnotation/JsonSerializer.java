package com.annotations.AdvancedLevel.SerializationAnnotation;

import java.lang.reflect.Field;

public class JsonSerializer {
    public static String toJson(Object obj) throws Exception {
        Class cls = obj.getClass();
        Field[] fields = cls.getDeclaredFields();
        StringBuilder json = new StringBuilder();
        json.append("{");
        boolean first = true;
        for (Field field : fields) {
            if (field.isAnnotationPresent(JsonField.class)) {
                field.setAccessible(true);
                JsonField annotation =
                        field.getAnnotation(JsonField.class);
                String key = annotation.name();
                Object value = field.get(obj);
                if (!first) {
                    json.append(", ");
                }
                json.append("\"")
                    .append(key)
                    .append("\": ")
                    .append("\"")
                    .append(value)
                    .append("\"");

                first = false;
            }
        }

        json.append("}");
        return json.toString();
    }
}
