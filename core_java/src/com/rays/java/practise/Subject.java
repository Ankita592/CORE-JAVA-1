package com.rays.java.practise;

public class Subject {
	
	private String name;
	private int marks;
	private int maxmarks;
	
	public Subject() {
		
	}

	public Subject(String name, int marks, int maxmarks) {
		this.name = name;
		this.marks = marks;
		this.maxmarks = maxmarks;
	}
	public String getName() {
		return name;
	}
	public int getMarks() {
		return marks;
	}
	public int getMaxmarks() {
		return maxmarks;
	}

	
	

}
