package com.rays.java.collection;

import java.util.ArrayDeque;

public class ArrayDequeExample {
	
	public static void main(String[] args) {
		
		ArrayDeque q =new ArrayDeque();
		
		q.offer(5);
		q.offer(8);
		q.offer("ram");
		q.offer("A");
		q.offer(9);
		
		//q.element(); //get top element
		//q.remove(); //remove top element
		//q.removeFirst(); //remove top element
		//q.removeLast(); // remove bottom element
		
		System.out.println(q);
		
		System.out.println("----------");
		
		System.out.println(q.peek() + " get top of the element ");
		
		System.out.println("--------------");
		
		System.out.println(q.poll() + " get top of the element and remove ");
		
		System.out.println("------------------");
		
		q.forEach(System.out::println);
		
		
	}

}
