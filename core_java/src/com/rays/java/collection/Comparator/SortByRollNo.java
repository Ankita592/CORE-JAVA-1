package com.rays.java.collection.Comparator;

import java.util.Comparator;

public class SortByRollNo implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		
		return o1.getRollno()-o2.getRollno();
	}

}
