package com.rays.javabasicExercise;

public class FibonacciSeries {
	public static void main(String[] args) {

		int n = 10;
		int firstTerm = 0;
		int secondTerm = 1;

		for (int i = 0; i < n; i++) {
			System.out.println(firstTerm + "  ");

			int nextTerm = firstTerm + secondTerm;
			firstTerm = secondTerm;
			secondTerm = nextTerm;

		}

	}

}
