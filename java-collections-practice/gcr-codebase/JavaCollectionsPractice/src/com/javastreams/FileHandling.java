package com.javastreams;
import java.io.*;
public class FileHandling {
	 public static void main(String[] args) {

  try{ FileInputStream fis =new FileInputStream("D:\\\\FileHandling\\\\source.txt");
	    FileOutputStream fos =new FileOutputStream("D:\\FileHandling\\destination.txt");
               int data;
	            while ((data = fis.read()) != -1) {
	                fos.write(data);
	            }
         fis.close();
	      fos.close();

	   System.out.println("File copied successfully."); } 
       catch(FileNotFoundException e) {
	            System.out.println("Source file not found."); } 
       catch(IOException e) {
	            System.out.println("I/O error occurred.");
	        }
	    }
}
