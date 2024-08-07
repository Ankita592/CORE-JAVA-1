package com.rays.java.collection.equalhascode;

public class Student {
	
	private Integer id;
	private String name;
	private Integer marks;
	
	
	//default constructor
	public Student() {
		
	}
	//parameter constructor
    public Student(int id, String name,Integer marks) {
    	
    	this.id = id;
    	this.name = name;
    	this.marks = marks;
    	
    }
    @Override
    public boolean equals(Object obj) {
    Student s = (Student) obj;
    return id.equals(s.id) && name.equals(s.name) && marks.equals(s.marks);
        			
    	} 	

    @Override
    public int hashCode() {
    	
    String value = id+ name+ marks;
    return value.hashCode();
        	
    }
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + " ";
	}
    
}

