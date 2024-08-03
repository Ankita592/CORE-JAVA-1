package com.rays.javabasicExercise;



public class AverageConsecutiveNumbers {

	public static void main(String[] args) {
		int sumOdd = 0, oddCount = 0;
		int sumEven = 0, evenCount = 0;
		int n = 20;

		for (int i = 1; i <= n; i++) {
			if (i % 2 == 0) {
				sumEven = sumEven + i;
				evenCount++;
			} else {
				sumOdd = sumOdd + i;
				oddCount++;
			}

		}
		System.out.println("Average of the even numbers " + sumEven / evenCount);
		System.out.println("Average of the odd numbers " + sumOdd / oddCount);
	}

}
