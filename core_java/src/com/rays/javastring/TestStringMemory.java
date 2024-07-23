package com.rays.javastring;

public class TestStringMemory {
public static void main(String[] args) {
	//literal pool
	String s1 = "xyz";
    String s3 = "xyzz";
	String s2 ="xyz";
	// == ,.equals
	System.out.println(s1== s3);
	System.out.println(s1.equals (s2));
	
}
}
