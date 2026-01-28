 package com.csvdatahandling.duplicate;
 import java.io.BufferedReader;
	import java.io.FileReader;
	import java.io.IOException;
	import java.util.HashSet;
	import java.util.Set;

public class DetectDuplicate {

	    public static void main(String[] args) {

	        String filePath="students.csv";
	        String line;
	        Set<String> seenIds=new HashSet<String>();
	        boolean foundDuplicate=false;
	        try {
	            BufferedReader br = new BufferedReader(new FileReader(filePath));
	            br.readLine();
	            System.out.println("Duplicate Records:");

	            while ((line=br.readLine())!=null) {
	                String[] data = line.split(",");
	                String id=data[0];
	                if (seenIds.contains(id)) {
	                    System.out.println("Duplicate ID Found: " + id);
	                    System.out.println(" Record: " + line);
	                    foundDuplicate=true;
	                } 
	                else {
	                    seenIds.add(id);
	                }
	            }

	            br.close();

	            if (!foundDuplicate) {
	                System.out.println("No duplicate records found");
	            }

	        } 
	        catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	}


