package com.rays.java.collection.streamAPI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ContestantWinnerList {
	
	public static void main(String[] args) {
		
	
	
	List <Contestant> list = new ArrayList<Contestant>();
	
	list.add(new Contestant("9856421378", "Ram"));
	list.add(new Contestant("9994526137", "Shyam"));
	list.add(new Contestant("9526452115", "Ghanshyam"));
	list.add(new Contestant("9475962145", "Vijay"));
	list.add(new Contestant("97845632180", "Ajay"));
	list.add(new Contestant("9745123690", "Mohit"));
	list.add(new Contestant("97845632180", "Rohit"));
	
	
	System.out.println("Get the phone no.");
	list.stream().map(l -> l.phone).forEach(System.out::println);
	
	System.out.println(" Get the valid phone no.");
	list.stream().map(l -> l.phone).filter(l -> l.length()==10).forEach(System.out::println);
	
	System.out.println("Remove duplicate number");
	list.stream().map(l -> l.phone).filter(l -> l.length()==10).distinct().forEach(System.out::println);
	
	
	System.out.println("---------------");
	
	//Contestant shuffle
	list.stream().map(l -> l.name + " " + l.phone).distinct().sorted()
	.collect(Collectors.collectingAndThen(Collectors.toList(), l -> {

		Collections.shuffle(l);
		return l.stream();
	})).limit(2).forEach(l -> System.out.println(l));
	
   }

}
