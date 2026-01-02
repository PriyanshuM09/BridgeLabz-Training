package com.encapsulation;

	public class BankingSystem {
	    public static void main(String[] args) {

	        BankAccount[] accounts = new BankAccount[2];

	        accounts[0] = new SavingsAccount(101, "Priyanshu", 80000, 4);
	        accounts[1] = new CurrentAccount(102, "Amit", 120000);

	        for (BankAccount acc : accounts) {

	            System.out.println("Account Number: " + acc.getAccountNumber());
	            System.out.println("Holder Name: " + acc.getHolderName());
	            System.out.println("Balance: " + acc.getBalance());

	            double interest = acc.calculateInterest();
	            System.out.println("Calculated Interest: " + interest);

	            Loanable loanAccount = (Loanable) acc;
	            loanAccount.applyForLoan(50000);
	            System.out.println("Loan Eligible: " +
	                    loanAccount.calculateLoanEligibility());

	            System.out.println();
	        }
	    }
	}



