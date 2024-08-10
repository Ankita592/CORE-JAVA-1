package com.rays.java.collection.Comparator;

import java.util.Comparator;

public class SortByAll implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		
		if( o1.getId() == o2.getId()) {
			return o1.getName().compareTo(o2.getName());
		}if(o1.getName()== o2.getName()) {
			return o1.getRollno()- o2.getRollno();
		}
		else {
			return o1.getRollno()- o2.getRollno();
		}
	}

}
