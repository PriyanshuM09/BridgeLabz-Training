package com.filereader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) {

        try {
            // Create FileReader
            FileReader fr = new FileReader("sample.txt");

            // Wrap FileReader with BufferedReader
            BufferedReader br = new BufferedReader(fr);

            String line;

            // Read file line by line
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            // Close resources
            br.close();
            fr.close();

        } catch (IOException e) {
            System.out.println("Error reading file");
        }
    }
}

