package com.AccountApp;

public class Accounts {
	
	private static int uniqueAccountNumber = 0;
	private String firstName;
	private String lastName;
	private int accountNumber;
	
	public Accounts(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.accountNumber = Accounts.uniqueAccountNumber;
		Accounts.uniqueAccountNumber++;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
}


