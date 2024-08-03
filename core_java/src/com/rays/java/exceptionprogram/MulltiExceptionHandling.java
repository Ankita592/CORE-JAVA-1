package com.rays.java.exceptionprogram;

public class MulltiExceptionHandling {
	
	public static void main(String[] args) {
		
		String name = "prashant";
		
		try {
			System.out.println(name.length());
			System.out.println(name.charAt(10));
		}catch (NullPointerException e) {
			System.out.println("Name can't be null ");
		}catch(StringIndexOutOfBoundsException e) {
			System.out.println("string is small");
		}
		}
	}


