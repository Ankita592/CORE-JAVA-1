package com.rays.java.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestStudentList {
	
	public static void main(String[] args) {
		
		List<Student> list = new ArrayList<Student>();
		
		list.add(new Student(12, "Shivay", "4th"));
		list.add(new Student(5, "Mohit", "7th"));
		list.add(new Student(1, "Rohit", "5th"));
		
		System.out.println(list);
		
		Iterator<Student> it= list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
			
		}
		
		
		
	}

}
