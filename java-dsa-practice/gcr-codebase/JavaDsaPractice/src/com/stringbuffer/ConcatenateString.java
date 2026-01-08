package com.stringbuffer;

public class ConcatenateString {
    public static void main(String[] args) {

        String[] words = {"Hello", " ", "World", "!", " Welcome", " to", " Java"};

        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < words.length; i++) {
            sb.append(words[i]);
        }

        String result = sb.toString();

        System.out.println(result);
    }
}

