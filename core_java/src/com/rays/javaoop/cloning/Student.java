package com.rays.javaoop.cloning;

public class Student implements Cloneable {
	
	public String name;
	public StudentAddress city;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String name,  StudentAddress city) {
		super();
		this.name = name;
		this.city = city;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public StudentAddress getCity() {
		return city;
	}

	public void setCity(StudentAddress city) {
		this.city = city;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public String toString() {
		return "Student [name=" + name + " ";
	}
	

	
	

}
