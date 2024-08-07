package com.rays.java.collection.Comparable;


public class Student implements Comparable<Student> {
	
	private int id;
	private String name;
	
	public Student() {
		
	}

	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}
	@Override
	public int compareTo(Student o) {
		//return this.id - o.id;
	      return this.name.compareTo(o.name);
		
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + " ";
	}
	
	
	
}
