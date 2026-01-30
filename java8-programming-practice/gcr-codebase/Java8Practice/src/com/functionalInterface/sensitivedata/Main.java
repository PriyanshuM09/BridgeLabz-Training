package com.functionalInterface.sensitivedata;

public class Main {
	public class SensitiveDataTest {

	    public static void main(String[] args) {

	        UserCredential credentials =
	                new UserCredential("admin", "admin123");

	        PublicProfile profile =
	                new PublicProfile("Suyash");

	        EncryptionService.encryptIfSensitive(credentials);
	        EncryptionService.encryptIfSensitive(profile);
	    }
	}

}
