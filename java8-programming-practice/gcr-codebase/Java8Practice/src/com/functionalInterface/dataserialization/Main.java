package com.functionalInterface.dataserialization;

public class Main {
	    public static void main(String[] args) {

	        Customer customer = new Customer(1, "Suyash");
	    
	        BackupProcessor.backupObject(customer); 
	    }
	}


