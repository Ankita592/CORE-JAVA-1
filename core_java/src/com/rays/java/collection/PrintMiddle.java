package com.rays.java.collection;

import java.util.ArrayList;
import java.util.List;

public class PrintMiddle {
	
	public static void main(String[] args) {
		
		List l = new ArrayList();
		
		l.add("shubham");
		l.add("anurag");
		l.add(29);
		l.add(30);
		l.add('S');
		l.add("priyanka");
		l.add(25);

		System.out.println(l.get((l.size() - 1) / 2));

	}

}


