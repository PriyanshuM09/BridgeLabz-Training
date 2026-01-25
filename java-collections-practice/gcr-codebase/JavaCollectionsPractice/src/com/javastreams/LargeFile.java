package com.javastreams;

import java.io.*;

public class LargeFile {

    public static void main(String[] args) {

        String filePath = "D:/FileHandling/largeFile.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            String line;

            while ((line = br.readLine()) != null) {
                if (line.toLowerCase().contains("error")) {
                    System.out.println(line);
                }
            }

        } catch (IOException e) {
            System.out.println("Error while reading the file");
        }
    }
}
