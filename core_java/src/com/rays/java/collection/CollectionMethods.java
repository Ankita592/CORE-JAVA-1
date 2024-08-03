package com.rays.java.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionMethods {

	
	public static void main(String[] args) {
		
		// adds a collection
		Collection c = new ArrayList();
		
		c.add(1);
		c.add(2);
		c.add("anurag");
		
		Collection c2 = new ArrayList();
		
		c2.add(1);
		c2.add(2);
		c2.add("samit");
		
		c.addAll(c2);
		c.isEmpty();
		
		System.out.println("collection = "+c);
		System.out.println(c);
		
		//membership checking ,inclusion checking
		Collection c3 = new ArrayList();
		
		c3.add(1);
		c3.add(2);
		c3.add("anurag");
		c.addAll(c3);
		
		
		System.out.println(c.contains("anurag"));
		System.out.println(c.containsAll(c3));
		
		//retain the elements matching passed collection
		Collection c4 = new ArrayList();
		c4.add(1);
		c4.add(2);
		c4.add("shubham");
		c.addAll(c4);
		
		c.retainAll(c4);
		System.out.println(c);
		
		
		
		// iterator
	    Collection c5 = new ArrayList();
	    c5.add(1);
	    c5.add(2.5);
	    c5.add("anurag");
	    c.addAll(c5);
	    
	    c.remove("anurag");
	    System.out.println(c);
	    
	   
	  	Collection c6 = new ArrayList();
	  	c6.add(1);
	  	c6.add(3);
	  	c6.add("shubham");
	  	c.addAll(c6);
	  	
	  	
	  	System.out.println("Size;" + c.size());
		Iterator i = c.iterator();
		while (i.hasNext()) {
		System.out.println(i.next());
		  	
	  			
			
			
		}
	}
}



