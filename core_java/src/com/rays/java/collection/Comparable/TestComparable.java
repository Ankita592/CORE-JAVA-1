package com.rays.java.collection.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class TestComparable {
	
	public static void main(String[] args) {
		
		List<Student> list = new ArrayList<Student>();

		list.add(new Student(02,"prashant"));
		list.add(new Student(04, "anurag"));
		list.add(new Student(06, "deepu"));
		list.add(new Student(01, "sandeep"));
		
	    Collections.sort(list);
	    
	    list.forEach(System.out::println);
		
		

	}

}
