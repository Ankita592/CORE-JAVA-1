package com.rays.java.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestCopyCollections {
	
	public static void main(String[] args) {
		
		List <String> list1 = new ArrayList<String>();
		
		list1.add("ram");
		list1.add("shyam");
		list1.add("shivay");
		
		List <String> list2= new ArrayList<String>(Collections.nCopies(list1.size(),""));
		
		Collections.copy(list2, list1);
		
		System.out.println(list1);
		System.out.println(list2);
		
		
		
		
		
		
		
		
		 
		 
		 
		
	}

}
