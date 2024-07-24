package com.rays.javaoop.encapsulation;

public class Account {
	private String number;
	private String type;
	private double balance;
	
	public void setNumber( String number) {
		this.number = number;
		
	}
	public String getnumber () {
		return this.number;
	}
	public void setType (String type) {
		this.type = type;
		
	}
	public String gettype () {
		return this.type;
		
	}
	public void setBalance (double balance) {
		this.balance = balance;
	}
	public double getbalance() {
		return this.balance;
	}
	public double deposit(double amount) {
		return this.balance= amount+balance;
	}
	public double withdraw(double amount) {
		if ( amount > this.balance) {
			System.out.println("insufficient balance");
			
		}else {
		return this.balance= balance - amount;
		}
	
	return this.balance;
	}
			
	public double fundtransfer(double amount) {
		if(amount>this.balance) {
			System.out.println("insufficient balance");
		}else {
			return this.balance= balance - amount;
		}
		return this.balance;
		
	}

}
