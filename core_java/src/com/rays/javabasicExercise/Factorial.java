package com.rays.javabasicExercise;

public class Factorial {
public static void main(String[] args) {
	int number=5;
	int factorial =1;
	for (int i=1; i<=5;i++) {
		factorial = factorial*i;
		
	}
	System.out.println("factorial of "+number+" = "+ factorial);
}
}
