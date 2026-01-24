package com.collections.queueinterface;
import java.util.*;

public class BinaryNumbers {
	public static void generateBinary(int N) {
		Queue<String>q=new LinkedList<>();
		q.add("1");
		
		
		for(int i=0;i<N;i++) {
			String curr=q.remove();
			System.out.print(curr +" ");
			
			q.add(curr +"0");
			q.add(curr +"1");
		}
	}
public static void main(String args[]) {
	int N=5;
	generateBinary(N);
}

}
