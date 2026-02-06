
package com.multithreading.bankingsystem;
import java.time.LocalDateTime;
public class Transaction implements Runnable{
	private   BankAccount account;
	private String name;
	private int amount;
	Transaction(BankAccount account,String name,int amount){
		this.account=account;
		this.name=name;
		this.amount=amount;
	}
	public void run() {
		System.out.println("Thread state before run : "+ Thread.currentThread().getState());
		System.out.println(name + amount);
		boolean success=account.withDraw(amount);
		if(success) {
			System.out.println("Transaction successful :"+ amount + account.getBalance() + LocalDateTime.now());
			
		}
		else {
			System.out.println("Transaction failed :"+ amount + account.getBalance() + LocalDateTime.now());
		}
		
	}
	

}