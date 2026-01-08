package com.stringbuffer;

public class RemoveDuplicates {
    public static void main(String[] args) {

        String input = "programming";

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char current = input.charAt(i);

            boolean isDuplicate = false;

            for (int j = 0; j < sb.length(); j++) {
                if (sb.charAt(j) == current) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                sb.append(current);
            }
        }

        System.out.println(sb.toString());
    }
}
