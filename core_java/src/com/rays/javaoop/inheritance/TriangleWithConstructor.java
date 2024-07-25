package com.rays.javaoop.inheritance;

public class TriangleWithConstructor {
	
	private int b ;
	private int h ;
	
	public TriangleWithConstructor() {
		// TODO Auto-generated constructor stub
	}
	public TriangleWithConstructor(int b, int h) {
		this.b = b;
		this.h = h;
		
	}
	public double area() {
	       double area = b*h/2;
	       return area;
	}

}
