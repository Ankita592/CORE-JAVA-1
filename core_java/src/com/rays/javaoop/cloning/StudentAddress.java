package com.rays.javaoop.cloning;

public class StudentAddress implements Cloneable {
	
	
	public String address;
	
	public StudentAddress() {
		// TODO Auto-generated constructor stub
	}

	public StudentAddress(String address) {
		super();
		this.address = address;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public String toString() {
		return "address =" + address + "]";
	}
	
	

}
