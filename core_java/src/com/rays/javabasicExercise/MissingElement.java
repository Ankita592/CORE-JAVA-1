package com.rays.javabasicExercise;

public class MissingElement{
	
	public static int missing(int[] A, int[] B,int n) {
		
		int sumA = 0;
		int sumB = 0;
		for (int num:A) {
			sumA += num;
			
		}
		for (int num:B) {
			sumB += num;
			
		}
		return sumA -sumB;
		
	}
	public static void main(String[] args) {
		int[] A = {33,65,98,12,55,64,88,100};
		int[] B =  {15,36,21,20,77,63,35};
		
		int missing = missing(A,B,A.length);
		System.out.println("  "+missing);
		
	}

		
		
	}


