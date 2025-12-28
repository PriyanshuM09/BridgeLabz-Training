package com.constructors.levelone;

public class BankAccountTest{

	public static void main(String[] args){
		// TODO Auto-generated method stub

		 BankAccount acc = new BankAccount(12345, "Priyanshu", 5000);
		     System.out.println("Balance: " + acc.getBalance());

		    acc.setBalance(7000);
		     System.out.println("Updated Balance: " + acc.getBalance());

		     System.out.println();

		      SavingsAccount sa = new SavingsAccount(67890, "Aman", 10000);
		    sa.displayDetails();
		    }
	}


