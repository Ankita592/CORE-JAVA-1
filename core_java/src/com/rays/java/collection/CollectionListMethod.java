package com.rays.java.collection;

import java.util.ArrayList;
import java.util.List;

public class CollectionListMethod {
	
	public static void main(String[] args) {
		
		List l = new ArrayList();
		
// adding 1 and 4 as element.
        l.add(1);
        l.add(4);
        l.add(5);
        l.add(7);
        l.add(9);
        l.add(10);


// adding element 8 at index 1.
        l.add(1, 8);

        System.out.println(l.get(1));
// it will return an element present at given index

// remove element at given index.
        l.remove(2);
        System.out.println(l);

// replace the element at given index.
        l.set(1, 8);
        System.out.println(l);

       
// prints the element from index 3 to 5 as 6 in non-inclusive.
        System.out.println(l.subList(3, 6));
        System.out.println(l.indexOf(7));
        l.add(10);
        l.add(7);
        System.out.println(l);

// this will return the index of element from end of the list.
        System.out.println(l.lastIndexOf(7));
    }

		
}


