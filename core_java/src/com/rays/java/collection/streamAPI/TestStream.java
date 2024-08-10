package com.rays.java.collection.streamAPI;

import java.util.ArrayList;
import java.util.List;

public class TestStream {
	
	public static void main(String[] args) {
		
		List <String> list= new ArrayList<String>();
		
		list.add("suman");
		list.add("aman");
		list.add("kumar");
		list.add("kumar");
		list.add("tarun");
		list.add("tanmay");
        
		
		System.out.println("list in upper case");
		list.stream().map(e -> e.toUpperCase()).forEach(System.out::println);
		
		System.out.println(" list in lower case & print only 3 list");
		list.stream().map(e -> e.toLowerCase()).limit(3).forEach(System.out::println);
		
		System.out.println("filter the list start with t");
		list.stream().filter(e -> e.startsWith("t")).forEach(System.out::println);
		
		System.out.println("remove duplicate elements & sortes element of the stream");
		list.stream().distinct().sorted().forEach(System.out::println);
		
		System.out.println("skip the element of the stream");
		list.stream().skip(1).forEach(System.out::println);
		
		
		
	}

}
