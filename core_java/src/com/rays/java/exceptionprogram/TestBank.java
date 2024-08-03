package com.rays.java.exceptionprogram;

public class TestBank {
	
	public static void main(String[] args) {

		Bank b = new Bank();

		b.setBalance(1000);
		b.deposite(2000);
		
		try {
			b.withdraw(4000);
			System.out.println(b.getBalance());
		} catch (BankException e) {
			System.out.println(e.getMessage());
		}
         System.out.println(b.getBalance());
	}


}
