package com.rays.javaoop.inheritance;

public class RectangleWithConstructor {
	
	private int l;
	private int w;
	
	public RectangleWithConstructor() {
		
	}
    public RectangleWithConstructor(int l,int w) {
    	this.l = l;
    	this.w = w;	
    	
    }
    public double area() {
    	double area = l*w;
    	return area;
    }
}
