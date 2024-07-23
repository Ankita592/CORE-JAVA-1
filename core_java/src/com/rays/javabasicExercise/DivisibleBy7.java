package com.rays.javabasicExercise;

public class DivisibleBy7 {
	public static void main(String[] args) {
		int sum= 0;
		System.out.println("Number divisible by 7 between 100 and 199:");
		for (int i = 100; i<200; i++) {
			if (i %7==0) {
				System.out.println(i+"");
				sum = sum + i;
			}
		}
		System.out.println("sum of these numbers:"+sum);
	}

}
