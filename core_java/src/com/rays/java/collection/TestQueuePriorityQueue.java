package com.rays.java.collection;

import java.util.PriorityQueue;
import java.util.Queue;

public class TestQueuePriorityQueue {
	
	public static void main(String[] args) {
		
		Queue q = new PriorityQueue();
		
		q.add("one");
		q.add("two");
		q.add("three");
		q.add("four");
		
		System.out.println(q);
		
		System.out.println("---------");
		
		System.out.println(q.peek());
		
		System.out.println("--------");
		
		System.out.println(q.poll());
		
		System.out.println(q);
	}

}
