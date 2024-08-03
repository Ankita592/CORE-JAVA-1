package com.rays.javaoop.polymorphism;

public class Rectangle extends Shape {
	
	private int l;
	private int w;
	
	public Rectangle() {
		
	}
    public Rectangle(int l,int w) {
    	this.l = l;
    	this.w = w;
    }
	public int getL() {
		return l;
	}
	public void setL(int l) {
		this.l = l;
	}
	public int getW() {
		return w;
	}
	public void setW(int w) {
		this.w = w;
	}
    @Override
    public double area() {
    	  double area = l* w;
    	return area;
    }
}
