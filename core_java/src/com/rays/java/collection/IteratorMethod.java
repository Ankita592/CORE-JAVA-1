package com.rays.java.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorMethod {
	
	public static void main(String[] args) {
		

		Collection c = new ArrayList();
		c.add(5);
		c.add('A');
		c.add("KGF");
		c.add(true);
		c.add(5.2);
		c.add(5);
		

		System.out.println("collection = " + c);
		System.out.println("------------");

		Iterator it = c.iterator();
		
		// cannot add element after iterator method
		//c.add("rays");
		
		//it.remove(); // remove next element

		while (it.hasNext()) {

			Object ob = it.next();
			System.out.println("collection by iterator = " + ob);

		}

	}
	

}
