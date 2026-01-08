package com.stringbuilder;

public class ReverseString {
public static void main(String args[]) {
	String s1="Hello";
	
	StringBuilder sb= new StringBuilder();
	sb.append(s1);
	
	sb.reverse();
	
	String reverseString= sb.toString();
    System.out.println(reverseString);
}
}
