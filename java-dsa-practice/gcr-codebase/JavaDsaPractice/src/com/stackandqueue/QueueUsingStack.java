package com.stackandqueue;

	import java.util.Stack;
	public class QueueUsingStack{
	Stack<Integer> st1=new Stack<>();
	Stack<Integer> st2=new Stack<>();

	public void enqueue(int x){
	st1.push(x);
	}
	public int dequeue(){
	if(st2.isEmpty()){
	while(!st1.isEmpty()){
	st2.push(st1.pop());
	}
	}
	if(st2.isEmpty()){
	throw new RuntimeException("queue is empty");
	}
	return st2.pop();
	}
	    public int peek() {
	        if (st2.isEmpty()) {
	            while (!st1.isEmpty()) {
	                st2.push(st1.pop());
	         }
	        }
	        if (st2.isEmpty()){
	            throw new RuntimeException("Queue is empty");
	        }
	        return st2.peek();
	 }
	
public static void main(String[]args) {
	  QueueUsingStack queue = new QueueUsingStack();

      queue.enqueue(10);
      queue.enqueue(20);
      queue.enqueue(30);

      System.out.println("Dequeued: " + queue.dequeue());
      System.out.println("Front element: " + queue.peek());

      queue.enqueue(40);

      System.out.println("Dequeued: " + queue.dequeue());
      System.out.println("Dequeued: " + queue.dequeue());
      System.out.println("Dequeued: " + queue.dequeue());

  }
}

