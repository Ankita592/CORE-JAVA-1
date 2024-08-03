package com.rays.javaoop.polymorphism;

public class Triangle extends Shape{
	
	private int b;
	private int h;
	
	public Triangle() {
		
	}
    public Triangle( int b, int h) {
    	this.b = b;
    	this.h = h;
    	
    }
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public int getH() {
		return h;
	}
	public void setH(int h) {
		this.h = h;
	}
	@Override
	public double area() {
		   double area = b*h/2;
		return area;
	}
    
}
