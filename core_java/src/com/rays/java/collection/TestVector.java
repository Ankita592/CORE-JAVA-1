package com.rays.java.collection;

import java.util.Enumeration;
import java.util.Vector;

public class TestVector {
	
	public static void main(String[] args) {
		
		Vector v = new Vector();
		
		v.addElement(5);
		v.add('S');
		
		System.out.println(v);
	
       Enumeration e = v.elements();
       
       // add element after enumeration
       v.addElement("abc");
       while(e.hasMoreElements()) {
    	   Object O = e.nextElement();
    	   System.out.println(O);
       }
	}   
       
}
