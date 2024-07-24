package com.rays.javaoop.encapsulation;

public class TestAccount {
	public static void main(String[] args) {
		 
		Account a1 = new Account();
		a1.setNumber("Account no. 123456");
		System.out.println(a1.getnumber());
		a1.setType("Account type is saving");
		System.out.println(a1.gettype());
		a1.setBalance( 500.00);
		System.out.println( a1.getbalance());
		a1.deposit(1200.00);
		System.out.println("after deposite total balance is ="+a1.getbalance());
		a1.withdraw(500.00);
		System.out.println("afte withdraw total balance is ="+a1.getbalance());
		a1.fundtransfer(1500.00);
		System.out.println("after fund transfer total balance is ="+a1.getbalance());
		
	}

}
