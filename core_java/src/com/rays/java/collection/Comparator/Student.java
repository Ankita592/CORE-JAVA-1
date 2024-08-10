package com.rays.java.collection.Comparator;

public class Student {
	
	private String name;
	private int id;
	private int rollno;
	
    public Student() {
	
    }

	public Student(String name, int id, int rollno) {
		this.name = name;
		this.id = id;
		this.rollno = rollno;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", rollno=" + rollno + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	
    
}
