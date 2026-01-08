package com.stringbuilder;
import java.util.HashSet;
public class RemoveDuplicates {
public static void main(String args[]) {
	
	String s1="Programming";
	
	StringBuilder sb= new StringBuilder();
	HashSet<Character> set= new HashSet();
	
	for(int i=0;i<s1.length();i++) {
		char ch=s1.charAt(i);
		
		if(!set.contains(ch)) {
			sb.append(ch);
			set.add(ch);
		}
	}
	  String result = sb.toString();

      System.out.println(result);
}
}
