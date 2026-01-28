package com.csvdatahandling.encryptdecrypt;
import java.io.*;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
public class EncryptDecrypt {
	    private static final String SECRET_KEY = "1234567890123456"; 
	    public static String encrypt(String data) throws Exception {
	        SecretKeySpec key = new SecretKeySpec(SECRET_KEY.getBytes(), "AES");
	        Cipher cipher=Cipher.getInstance("AES");
	        cipher.init(Cipher.ENCRYPT_MODE, key);
	        byte[] encrypted=cipher.doFinal(data.getBytes());
	        return Base64.getEncoder().encodeToString(encrypted);
	    }

	    public static String decrypt(String encryptedData) throws Exception {
	        SecretKeySpec key = new SecretKeySpec(SECRET_KEY.getBytes(), "AES");
	        Cipher cipher = Cipher.getInstance("AES");
	        cipher.init(Cipher.DECRYPT_MODE, key);
	        byte[] decoded = Base64.getDecoder().decode(encryptedData);
	        return new String(cipher.doFinal(decoded));
	    }
	    public static void writeEncryptedCSV() {

	        try {
	            BufferedWriter bw=new BufferedWriter(new FileWriter("employees_secure.csv"));
	            bw.write("ID,Name,Email,Salary");
	            bw.newLine();

	            bw.write("101,Ankit," +encrypt("ankit@gmail.com") + "," + encrypt("55000"));
	            bw.newLine();
	            bw.close();
	            System.out.println("Encrypted CSV created!");

	        } 
	        catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	    public static void readDecryptedCSV() {

	        try {
	            BufferedReader br=new BufferedReader(new FileReader("employees_secure.csv"));
	            br.readLine(); 
	            String line;
	            System.out.println("Decrypted Data:");

	            while ((line=br.readLine()) != null) {
	                String[] data=line.split(",");
	                System.out.println("ID     : " + data[0]);
	                System.out.println("Name   : " + data[1]);
	                System.out.println("Email  : " + decrypt(data[2]));
	                System.out.println("Salary : " + decrypt(data[3]));
	            }
	            br.close();
	        } 
	        catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	    public static void main(String[] args) {
	        writeEncryptedCSV();
	        readDecryptedCSV();
	    }
	}


