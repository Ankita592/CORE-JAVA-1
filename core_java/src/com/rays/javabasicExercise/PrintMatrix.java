package com.rays.javabasicExercise;

public class PrintMatrix {
	public static void main(String[] args) {
		int[][] tables =new int[9][10];
		
		
		
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 10; j++) {
				tables[i][j]=(i+2)*(j+1);
			}
		}
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 10; j++) {
			System.out.printf("%4d",tables[i][j]);
				
			}
			System.out.println();
		}
	}

}
