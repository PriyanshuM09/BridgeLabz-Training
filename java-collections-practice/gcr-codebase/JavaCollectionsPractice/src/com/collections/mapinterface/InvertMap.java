package com.collections.mapinterface;

import java.util.*;
public class InvertMap{

    public static void main(String[] args) {
      Map<String, Integer> original = new HashMap<>();
        original.put("A", 1);
        original.put("B", 2);
        original.put("C", 1);

   Map<Integer, List<String>> inverted = new HashMap<>();
        // Inversion logic
     for(Map.Entry<String, Integer> entry : original.entrySet()) {

       String key = entry.getKey();
       Integer value = entry.getValue();

        if(inverted.containsKey(value)){
         inverted.get(value).add(key);
            } 
            else {
                List<String> list = new ArrayList<>();
                list.add(key);
                inverted.put(value, list);
            }
        }
        System.out.println(inverted);
    }
}