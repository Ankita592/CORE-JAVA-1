package com.rays.javaoop.encapsulation;

public class TestPerson {
	public static void main(String[] args) {

		Person p1 = new Person();

		p1.setFirstName("Sushobhit");
		System.out.println(p1.getFirstName());
		p1.setLastname("Pandey");
		System.out.println(p1.getLastName());
		p1.setAge(29);
		System.out.println(p1.getAge());
		p1.setAddress("indore");
		System.out.println(p1.getAddress());

	}
}
