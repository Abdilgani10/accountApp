package com.AccountApp;

import java.util.HashMap;
import java.util.Map;

public class Services {
	
private Map<Integer, Accounts> accounts;
	
	public Services() {
		super();
		this.accounts = new HashMap<Integer, Accounts>();
	}
	
	public void addAccount (Accounts account) {
		this.accounts.put(account.getAccountNumber(), account);
	}
	
	public Accounts retrieveAccount (int accountNumber) {
		return this.accounts.get(accountNumber);
	}

	public Map<Integer, Accounts> getAccounts() {
		return accounts;
	}
}


