package com.rays.java.collection.equalhascode;

public class TestEqualHashcode {
	
	public static void main(String[] args) {
		
		Student s = new Student(01, "shyam",100);
		Student s1 = new Student(01, "shyam", 100);
		
		//check both reference and value
		System.out.println(s.equals(s1));
		
		//unique integer value
		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());
		
		
	}

}
