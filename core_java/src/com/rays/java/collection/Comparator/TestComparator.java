package com.rays.java.collection.Comparator;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestComparator {
	
	public static void main(String[] args) {
		
		List<Student> list =new ArrayList<Student>();
		
		list.add(new Student("Dhruv", 05, 106));
		list.add(new Student("Sumit", 02, 104));
		list.add(new Student("Amit", 01, 103));
		list.add(new Student("Amit", 01, 101));
		list.add(new Student("Mohit", 06, 102));
		list.add(new Student("Pankaj", 04,105));
		
		SortById byid = new SortById();
		
		Collections.sort(list,byid);
		System.out.println("Sort by ID");
		list.forEach(System.out::println);
		
		SortByName byname= new SortByName();
		
		Collections.sort(list,byname);
		System.out.println("Sort by name");
		list.forEach(System.out::println);
		
		SortByRollNo byrollno = new SortByRollNo();
		
		Collections.sort(list,byrollno);
		System.out.println("Sort by rollno");
		list.forEach(System.out::println);
		
		SortByAll byall = new SortByAll();
		
		Collections.sort(list,byall);
		System.out.println("Sort by all");
		list.forEach(System.out::println);
		
		
	}

}
