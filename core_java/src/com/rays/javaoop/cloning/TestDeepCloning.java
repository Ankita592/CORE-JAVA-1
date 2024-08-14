package com.rays.javaoop.cloning;

public class TestDeepCloning implements Cloneable {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Student s = new Student("Anurag",new StudentAddress("INDORE"));
		
		Student s1 = (Student)s.clone();
		
		s1.name = "Vijay";
		s1.city = new StudentAddress("BHOPAL");
		
		System.out.println(s);
		System.out.println(s1);
		
		
		
	}

}
