package com.stackandqueue;
import java.util.Stack;
public class StackRecrsion {
	 public static void sort(Stack<Integer> st) {
		 if(!st.isEmpty()) {
			 int top=st.pop();
			 sort(st);
			 sortInsert(st,top);
			 
		 }
	 }
	 public static void sortInsert(Stack<Integer>st,int element) {
		 if(st.isEmpty() || st.peek()<=element) {
			 st.push(element);
			 return;
		 }
		 int top=st.pop();
		 sortInsert(st,element);
		 st.push(top);
	 }
	 public static void main(String[]args) {
		 Stack<Integer> st=new Stack<>();
		 st.push(30);
		 st.push(10);
		 st.push(20);
		 st.push(40);
		 System.out.println("original stack :"+ st);
		 sort(st);
		 System.out.println("sorted stack : "+st);
	 }

}
