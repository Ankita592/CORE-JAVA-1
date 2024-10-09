package com.rays.javastring;
//this is string program

public class TestString {
	public static void main(String[] args) {
		String name = "vijay dinanath chouhan";
		System.out.println(name);
		System.out.println("String length="+name.length());
		System.out.println(name.charAt(6));
		System.out.println(name.substring(6));
				System.out.println("bada vijay="+ name.toUpperCase());
				System.out.println("chota vijay="+name.toLowerCase());
				System.out.println("replace a to b ="+ name.replace('a', 'b'));
				System.out.println(name);
	}

}
