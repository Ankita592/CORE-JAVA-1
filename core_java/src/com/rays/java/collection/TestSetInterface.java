package com.rays.java.collection;

import java.util.HashSet;
import java.util.Set;

public class TestSetInterface {
	
	public static void main(String[] args) {

		Set s = new HashSet();

		s.add("kalki");
		s.add("kalki");
		s.add(null);
		s.add(null);
		s.add(5);
		s.add('a');

		System.out.println(s);

	

	}

}
