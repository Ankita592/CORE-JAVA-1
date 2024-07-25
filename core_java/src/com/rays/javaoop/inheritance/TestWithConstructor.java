package com.rays.javaoop.inheritance;

public class TestWithConstructor {
    public static void main(String[] args) {
		
    	CircleWithConstructor c = new CircleWithConstructor(5);
    	RectangleWithConstructor r = new RectangleWithConstructor(11, 9); 
    	TriangleWithConstructor t = new TriangleWithConstructor(15, 20);
    	
    	
    	System.out.println(c.area());
    	System.out.println(r.area());
    	System.out.println(t.area());
    	
	}

}
