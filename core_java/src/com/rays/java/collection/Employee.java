package com.rays.java.collection;


public class Employee {
	
	
	    private int id;
		private String name;
		private String salary;
		
		public Employee() {
			
		}
		public Employee(int id, String name ,String salary) {
			
			this.id = id;
			this.name = name;
			this.salary = salary;
			
			
		}
		@Override
		public String toString() {
			return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
		}
		
		
			
		
		
		
		
}


