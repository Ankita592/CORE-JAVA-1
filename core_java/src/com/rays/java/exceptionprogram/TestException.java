package com.rays.java.exceptionprogram;


public class TestException {
	
	public static void main(String[] args) {
		
		int i = 5;
		int j = 0;
		
		
		try {
			System.out.println("Arthematic Exception");
			System.out.println(i/j);
		}catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		
		String name = null;
		
		try {
			System.out.println("Null Point Exception ");
			System.out.println(name.length());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	     String[] array = {"22","5","9","7"};
	     
	     try {
	    	 System.out.println("Index Out Of Bounds Exception");
	    	 // get 5th index of the array
	    	 System.out.println(array[5]);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
}

