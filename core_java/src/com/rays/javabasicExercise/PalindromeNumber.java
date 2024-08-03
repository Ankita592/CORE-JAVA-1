package com.rays.javabasicExercise;

public class PalindromeNumber {
	public static void main(String[] args) {
		
		 int i = 121;
		 int reverse = 0 ;
		 int r = 0 ;
		 int num = i;
		 while (num>0) {
		 
		 r = num%10;
		 reverse = (reverse*10)+ r;
		 num = num/10;
		 }
		 if (i == reverse) {
			 System.out.println( i + " is a palindrome number ");
		 }else {
			 System.out.println("is not a palindrome number ");
		 }
		 
		 
	}

	}


