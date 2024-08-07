package com.rays.java.collection;

import java.util.TreeSet;

public class TreeSetExample {
	
	public static void main(String[] args) {
		
		
		// does not maintain any order
		TreeSet t = new TreeSet();
		
		t.add("zero");
		t.add("one");
		t.add("two");
		t.add("four");
		
		t.forEach(System.out::println);
	}

}
