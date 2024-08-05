package com.rays.java.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestEmployeeList {
	
	public static void main(String[] args) {
		
		List<Employee> list =new ArrayList<Employee>();
		
		list.add(new Employee(1, "Ram", "5000"));
		list.add(new Employee(2, "shyam", "6000"));
		
		System.out.println(list);
		
		Iterator<Employee> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
			
		}
	}
	
			
		
		
		

}
