package com.rays.java.collection;

import java.util.Stack;

public class TestStack {
	
	public static void main(String[] args) {
		
		Stack s1 =new Stack();
		
		s1.add('a');
		s1.add('b');
		s1.add('c');
		
		System.out.println(s1);
		
		System.out.println(s1.peek());
		
		System.out.println(s1);
		
		s1.pop();
		System.out.println(s1);
	}

}
