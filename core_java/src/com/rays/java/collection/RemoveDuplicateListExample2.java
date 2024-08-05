package com.rays.java.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RemoveDuplicateListExample2 {
	
public static void main(String[] args) {
		
		List list = new ArrayList();
		
		
		list.add("anurag");
		list.add("anurag");
		list.add('B');
		list.add('A');
		list.add("prashnat");
		
		
		System.out.println(list);
		
		for (int i = 0; i < list.size(); i++) {
			
			for (int j = i + 1; j < list.size(); j++) 

				if (list.get(i).equals(list.get(j))) {

					list.remove(j);

				}
			
		}

			Iterator it = list.iterator();

			while (it.hasNext()) {

				System.out.println(it.next());
		
			}
		}
   }

