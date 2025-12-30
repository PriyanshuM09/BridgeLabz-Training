package com.objectmodelling;

public class Bank {
	  private String bankName;

	    public Bank(String bankName) {
	        this.bankName = bankName;
	    }

	    public String getBankName() {
	        return bankName;
	    }

	    public Account openAccount(Customer customer, int accNo, double initialBalance) {
	        Account account = new Account(accNo, initialBalance, this);
	        customer.addAccount(account);
	        return account;
	    }
}
