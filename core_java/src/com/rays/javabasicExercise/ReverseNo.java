package com.rays.javabasicExercise;

public class ReverseNo {
	public static void main(String[] args) {
		 int i = 159;
		 int reverse = 0 ;
		 int r = 0 ;
		 int num = i;
		 while (num>0) {
		 
		 r = num%10;
		 reverse = (reverse*10)+ r;
		 num = num/10;
		 }
		 System.out.println(reverse);
		 
	}

}
