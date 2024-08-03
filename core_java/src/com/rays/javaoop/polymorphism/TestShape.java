package com.rays.javaoop.polymorphism;

public class TestShape {
	public static void main(String[] args) {
		
		
		Shape s1 = new Circle(5);
		Shape s2 = new Rectangle(7,5);
		Shape s3 = new Triangle(5,7);
		
		
		
		System.out.println(s1.area());
		System.out.println(s2.area());
		System.out.println(s3.area());
		
	}



}
