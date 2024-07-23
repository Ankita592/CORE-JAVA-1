package com.rays.javabasicExercise;

public class PrintNumberTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 1
		 * 22
		 * 333
		 * 4444
		 * 
		 * ALGORITHM:
		 * 
		 * print 1
		 * increment by 1 and print 2 times
		 * i++ = i + 1
		 * 1
		 * 12
		 * 123
		 * 1234
		 * write a method that takes an integer array as a parameter and find the largest number of array.
		 * 
		 */
	
		for (int i = 1; i<= 4; i++) {
			for(int j = 1; j<=i ; j++ ) {
				System.out.print(i);
				
			}
			System.out.println();
			
		}

	}

}
