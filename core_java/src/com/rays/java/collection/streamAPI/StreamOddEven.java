package com.rays.java.collection.streamAPI;

import java.util.ArrayList;
import java.util.List;

public class StreamOddEven {
	
	public static boolean oddEven(int i) {
		
		if (i%2==0) {
			System.out.println(i + "= even ");
		
		return true;
		
	}else if ( i % 2 != 0) {
		System.out.println(i + "= odd ");
		
	    return true;
	}
		return false;
		
	}
	public static void main(String[] args) {
		
		List<Integer> l = new ArrayList<Integer>();
		
		l.add(2);
		l.add(3);
		l.add(5);
		l.add(8);
		l.add(9);
		l.add(7);
		
		System.out.println(l);
		l.stream().filter(e -> oddEven(e)).forEach(System.out::println);
	}

}
