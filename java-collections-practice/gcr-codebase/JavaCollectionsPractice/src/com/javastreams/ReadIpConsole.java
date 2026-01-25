package com.javastreams;
import java.io.*;

public class ReadIpConsole {
	  public static void main(String[] args) {
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        FileWriter fw = null;
	   try {System.out.print("Enter your name: ");
	            String name = br.readLine();
            System.out.print("Enter your age: ");
	            String age = br.readLine();

	          System.out.print("Enter your favorite programming language: ");
	            String language = br.readLine();

	            fw = new FileWriter("user_details.txt");

	         fw.write("Name: " + name + "\n");
	           fw.write("Age: " + age + "\n");
	            fw.write("Favorite Language: " + language + "\n");

	            System.out.println("Details saved successfully.");
	        } 
	   catch (IOException e) {
	            System.out.println("Error occurred while reading or writing data.");

	        } finally {
	            try {
	                if (fw != null)
	                    fw.close();
	            } catch (IOException e) {
	                System.out.println("Error while closing file.");
	            }
	        }
	    }
}
