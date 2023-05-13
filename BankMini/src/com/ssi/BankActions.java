package com.ssi;
import java.util.LinkedList;
import java.util.Map;
import java.util.HashMap;
public class BankActions extends RuntimeException {

	static LinkedList<String> accountNumbers= new LinkedList<>();
	Map<String, Long> balances;

	public BankActions() { 
		balances = new HashMap<>();
	}
	public BankActions(String errorMsg) {
		super(errorMsg);

	}

	public void addAccount(String accountNumber, long balance) {
		System.err.println("add account method inkoved");
		try {
			if (accountNumbers.contains(accountNumber)) {
				throw new BankActions("EXCEPTION--Account number already exists,Can't add again. Please Check it");
			}
			accountNumbers.add(accountNumber);
			balances.put(accountNumber, balance);
			System.out.println("account number is "+ accountNumber +" - "+ "Balance in the added account is "+ balance);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}


	public void getBalance(String accountNumber) {
		System.err.println("Get bal method inkoved");
		try {
			if (!accountNumbers.contains(accountNumber)) {
				throw new BankActions("EXCEPTION-Account Number does not exist,Please enter correct Account number");
			}
			System.out.println("The Balance of "+ accountNumber + " is -- "+balances.get(accountNumber));
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}


	public void withdraw(String accountNumber, long amount) {
		System.err.println("withdraw method inkoved");
		try {
			if (!accountNumbers.contains(accountNumber)) {
				throw new BankActions("EXCEPTION-Account number does not exist, so can't withdraw money");
			}
			long balance = balances.get(accountNumber);
			if (amount > balance) {
				throw new BankActions("EXCEPTION- Withdraw money is greater than balance. Please Check it");
			}
			balances.put(accountNumber, balance - amount);
			System.out.println("the Withdrawn Money is - "+ amount + ". Thankyou Visit again");
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}


	public void deposit(String accountNumber, long amount) {
		System.err.println("Deposit money method inkoved");
		try {
			if (!accountNumbers.contains(accountNumber)) {
				throw new BankActions("EXCEPTION- Account number does not exist. Can't deposit into a Ghost Account");
			}
			long balance = balances.get(accountNumber);
			balances.put(accountNumber, balance + amount);
			System.out.println(amount+ " - is the deposited amount");
			System.out.println(balance+amount + " - is the new updated balance");
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void accountExists(String accountNumber) {
		System.err.println("account number exist method inkoved");
		try {
			if( accountNumbers.contains(accountNumber)) {
				System.out.println(accountNumber +" - Yes,Account exists");
			}
			else {
				throw new BankActions("Account number Not Found in our record");
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}





