package com.rays.java.exceptionprogram;

public class Bank {
	
	double balance;

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double withdraw(double amount) throws BankException {

		if (amount > balance) {

			throw new BankException("Insufficient Balance " + "Your withdraw amount is more than the balance");

		}

		balance -= amount;

		return balance;
	}
	public double deposite(double amount) {
		balance = amount + balance;
		return balance;
		
	}


}
