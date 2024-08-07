package com.rays.java.collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
	
	public static void main(String[] args) {
		
		// does not contain duplicate values and contain only one null values
		// does not maintain any order
		HashSet s = new HashSet();
		
		s.add("zero");
		s.add("one");
		s.add("two");
		s.add("three");
		s.add("one");
		s.add("null");
		s.add("null");
		
		//s.forEach(System.out::println);
		
		Iterator  i = s.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
			
		}
	}

}
