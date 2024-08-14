package com.rays.javaoop.cloning;

public class TestShallowCloning implements Cloneable{
	
       public static void main(String[] args) throws CloneNotSupportedException {
    	   
    		Employee e = new Employee("Anurag", "Indore");

    		Employee e2 = (Employee) e.clone();

    		System.out.println(e);
    		
    		e2.setName("Arpit");
    		e2.setAddress("Bhopal");
    		
    		System.out.println(e2);


    	}
		
}


