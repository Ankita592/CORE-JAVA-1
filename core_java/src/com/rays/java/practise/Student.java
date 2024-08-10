package com.rays.java.practise;

import java.util.Map;

public class Student {
	
	private int rollno;
	private String firstname;
	private String lastname;
	private int dob;
	private int std;
	
    public Student() {
	
    }

	public Student(int rollno, String firstname, String lastname, int dob, int std) {
		this.rollno = rollno;
		this.firstname = firstname;
		this.lastname = lastname;
		this.dob = dob;
		this.std = std;
	}
	public int getRollno() {
		return rollno;
	}
	public String getFirstname() {
		return firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public int getDob() {
		return dob;
	}
	public int getStd() {
		return std;
	}


}
