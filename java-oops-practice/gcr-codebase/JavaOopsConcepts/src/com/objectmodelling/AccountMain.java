package com.objectmodelling;

public class AccountMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Bank bank = new Bank("State Bank of India");

	        Customer c1 = new Customer("Amit");
	        Customer c2 = new Customer("Neha");

	        bank.openAccount(c1, 101, 5000);
	        bank.openAccount(c1, 102, 12000);
	        bank.openAccount(c2, 201, 8000);

	        c1.viewBalance();
	        System.out.println();
	        c2.viewBalance();
	}

}
