package com.rays.java.collection.streamAPI;

import java.util.ArrayList;
import java.util.List;

public class StreamPrimeNo {
	
	public static boolean isPrime(int n) {
		
		int count = 0;
		
		if ( n == 0) {
			
			return false;	
		}
		for (int i = 2; i < n ; i++) {
			if( n% i == 0) {
				
				count++;
				
			}
			
		}return count == 0;
	}
	
	
	
	public static void main(String[] args) {
	
		
		List <Integer> l = new ArrayList<Integer>();
		
		l.add(9);
		l.add(5);
		l.add(7);
		l.add(3);
		l.add(2);
		l.add(1);
		l.add(17);
		
		
		System.out.println("Is Prime Number");
		l.stream().filter(c -> isPrime(c)).forEach(System.out::println);
			
		}
			
		
}


