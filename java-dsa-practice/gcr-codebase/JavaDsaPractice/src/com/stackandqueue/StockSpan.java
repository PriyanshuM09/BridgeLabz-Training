package com.stackandqueue;
import java.util.Stack;

public class StockSpan {
	public static int[] CalSpan(int []prices) {
		int n=prices.length;
		int [] span=new int[n];
		Stack<Integer> st=new Stack<>();
		for(int i=0;i<n;i++) {
			while(!st.isEmpty() && prices[i]>=prices[st.peek()]) {
				st.pop();
			
			}
		span[i]=st.isEmpty() ? (i+1):(i-st.peek());
		st.push(i);
		}
	return span;
	}
public static void main(String []args) {
	int prices[]= {100,60,50,90,70,88};
	int span[]=CalSpan(prices);
	for(int price: prices) {
		System.out.print(price + " ");
	}
	for(int s:span) {
		System.out.print(s+" ");
	}
}
}
