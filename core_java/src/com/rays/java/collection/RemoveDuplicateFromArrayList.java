package com.rays.java.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
//import java.util.TreeSet;

public class RemoveDuplicateFromArrayList {
	
	public static void main(String[] args) {
		
		List list = new ArrayList();
		
		list.add("sushobhit");
		list.add("anurag");
		list.add("anurag");
		list.add('B');
		list.add('A');
		list.add('B');
		list.add("prashnat");
		list.add('A');
		list.add("samit");
		
		System.out.println("Array list " +list);
		
		//TreeSet s = new TreeSet(list);
		HashSet s =new HashSet(list);
		System.out.println(s);
		
	}

}
