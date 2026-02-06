package com.multithreading.bankingsystem;

public class Main {
public static void main(String[]args) throws InterruptedException{
	BankAccount b=new BankAccount();
	Thread t1=new Thread (new Transaction(b,"customer 1",3000),"customer 1");
	Thread t2=new Thread (new Transaction(b,"customer 2",4000),"customer 2");
	Thread t3=new Thread (new Transaction(b,"customer 3",1000),"customer 3");
	Thread t4=new Thread (new Transaction(b,"customer 4",1500),"customer 4");
	
	 System.out.println(t1.getName() + " state: " + t1.getState());
t1.start();
t2.start();
t3.start();
t4.start();

t1.join();
t2.join();
t3.join();
t4.join();
System.out.println("Final Account balance" + b.getBalance());
}
}