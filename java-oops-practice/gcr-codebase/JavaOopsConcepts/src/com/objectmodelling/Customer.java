package com.objectmodelling;
import java.util.ArrayList;
public class Customer {
	  private String name;
	    private ArrayList<Account> accounts;

	    public Customer(String name) {
	        this.name = name;
	        this.accounts = new ArrayList<>();
	    }

	    public void addAccount(Account account) {
	        accounts.add(account);
	    }

	    public void viewBalance() {
	        System.out.println("Account details of " + name + ":");
	        for (Account acc : accounts) {
	            System.out.println(
	                "Bank: " + acc.getBank().getBankName() +
	                ", Account No: " + acc.getAccountNumber() +
	                ", Balance: " + acc.getBalance()
	            );
	        }
	    }
}
