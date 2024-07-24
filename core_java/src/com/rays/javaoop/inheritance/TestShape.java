package com.rays.javaoop.inheritance;

public class TestShape {
	public static void main(String[] args) {
		Circle c = new Circle();
		Rectangle r = new Rectangle();
		Triangle t = new Triangle();
		
		c.setColour("yellow");
		System.out.println(c.getColour());
		c.setBorderwidth(1);
		System.out.println(c.getBorderwidth());
		c.setRadius(3);
		System.out.println(c.getRadius());
		c.area();
		
		r.setColour("blue");
		System.out.println(r.getColour());
		r.setBorderwidth(1);
		System.out.println(r.getBorderwidth());
		r.setLength(4);
		System.out.println(r.getLength());
		r.setWidth(3);
		System.out.println(r.getWidth());
		r.area();
		
		t.setColour("red");
		System.out.println(t.getColour());
		t.setBorderwidth(1);
		System.out.println(t.getBorderwidth());
		t.setBase(5);
		System.out.println(t.getBase());
		t.setHeight(7);
		System.out.println(t.getHeight());
		t.area();
		
	}

}
