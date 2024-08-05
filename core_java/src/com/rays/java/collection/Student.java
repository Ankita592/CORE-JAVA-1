package com.rays.java.collection;

public class Student {
	
	private int rollno;
	private String name;
	private String std;
	
	public Student() {
		
	}
    public Student(int rollno,String name, String std) {
    	this.rollno = rollno;
    	this.name = name;
    	this.std = std;
    }
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", std=" + std + "]";
	}
    
}
