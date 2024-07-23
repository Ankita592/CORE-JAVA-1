package com.rays.javaoop.encapsulation;

public class Person {
	private String firstName;
	private String lastName;
	private int Age;
	private String address;

	public void setFirstName(String firstName) {
		this.firstName = firstName;

	}

	public String getFirstName() {
		return this.firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastname( String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		this.Age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
