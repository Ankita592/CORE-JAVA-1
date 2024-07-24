package com.rays.javaoop.inheritance;

public class Circle extends Shape {
	 
	private int Radius;

	public int getRadius() {
		return Radius;
	}

	public void setRadius(int radius) {
		Radius = radius;
	}
	public void area() {
		System.out.println(Radius*Radius*3.14);
	}
	 

	}
	
	
	


