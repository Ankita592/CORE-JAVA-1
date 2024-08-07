package com.rays.java.collection;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {
	
	public static void main(String[] args) {
		
		// it maintain insertion order
		// elements are iterated in the same order in which they have been added
		LinkedHashSet lh= new LinkedHashSet();
		
		lh.add(5);
		lh.add("hello");
		lh.add("indore");
		
		lh.forEach(System.out::println);
		
		
		
	}

}
