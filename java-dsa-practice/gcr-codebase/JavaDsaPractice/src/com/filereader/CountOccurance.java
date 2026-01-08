package com.filereader;

	import java.io.BufferedReader;
	import java.io.FileReader;
	import java.io.IOException;
	import java.util.Scanner;

	public class CountOccurance {
	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        // Take file path and target word as input
	        System.out.print("Enter file path: ");
	        String filePath = sc.nextLine();

	        System.out.print("Enter word to search: ");
	        String targetWord = sc.nextLine();

	        int count = 0;

	        try {
	            BufferedReader br = new BufferedReader(new FileReader(filePath));

	            String line;
	            while ((line = br.readLine()) != null) {

	                String[] words = line.split("\\s+");


	                for (String word : words) {
	                    if (word.equals(targetWord)) {
	                        count++;
	                    }
	                }
	            }

	            br.close();

	            System.out.println("Occurrence of \"" + targetWord + "\": " + count);

	        } catch (IOException e) {
	            e.printStackTrace();
	        }

	    }
	}
