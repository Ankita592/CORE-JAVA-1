package com.rays.javaoop.encapsulation;

public class TestAccount {
	public static void main(String[] args) {
		 
		Account a1 = new Account();
		a1.setNumber("Account no. 123456");
		System.out.println(a1.getnumber());
		a1.setType("Account type is saving");
		System.out.println(a1.gettype());
		a1.setBalance( 5724564.21);
		System.out.println( a1.getbalance());
		
	}

}
