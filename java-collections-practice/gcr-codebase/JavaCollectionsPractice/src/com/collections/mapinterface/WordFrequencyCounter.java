package com.collections.mapinterface;
import java.util.HashMap;
public class WordFrequencyCounter {
public static void main(String args[]) {
	String s= "Hello world, hello Java!";
	s= s.toLowerCase();
	
	s=s.replaceAll("[^a-z]", " ");
	String words[]= s.split("\\s+");
	
	HashMap<String,Integer>hm= new HashMap<>();
	
	for(String word:words) {
		if(hm.containsKey(word)) {
			hm.put(word,hm.get(word)+1);
		}
		else {
			hm.put(word,1);
		}
	}
	System.out.print(hm);
}
}
