package com.multithreading.bankingsystem;

public class BankAccount {
	private int balance=10000;
	public int getBalance() {
		return balance;
	}
	public boolean withDraw(int amount) {
		if(balance>=amount) {
			balance-=amount;
			return true;
		}
		return false;
	}

}