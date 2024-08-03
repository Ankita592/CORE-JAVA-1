package com.rays.javaoop.inheritance;

public class TestBank {
	
	public static void main(String[] args) {
		
		AxisBank a = new AxisBank();
		HdfcBank h = new HdfcBank();
		IciciBank i = new IciciBank();
		
		a.setName("Axis Bank");
		System.out.println(a.getName());
		a.setIntrestRate(11.25);
		System.out.println(a.getIntrestRate());
		
		h.setName("Hdfc Bank");
		System.out.println(h.getName());
		h.setIntrestRate(10.10);
		System.out.println(h.getIntrestRate());
		
		i.setName("Icici Bank");
		System.out.println(i.getName());
		i.setIntrestRate(9.75);
		System.out.println(i.getIntrestRate());
	}
	
	

}
