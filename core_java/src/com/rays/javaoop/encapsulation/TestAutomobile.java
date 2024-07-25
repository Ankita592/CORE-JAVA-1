package com.rays.javaoop.encapsulation;

public class TestAutomobile {
	public static void main(String[] args) {
		
		Automobile y= new Automobile();
		y.setcolour("Metallic blue");
		System.out.println("colour of the car is = "+y.getcolour());
		y.setspeed(60);
		System.out.println("Speed of the car is = "+y.getspeed());
		y.setgear(4);
		System.out.println("Gear no. of the car is = "+y.getgear());
		y.setmake("Maruti suzuki swift");
		System.out.println("Make of the car is "+y.getmake());
		y.getSpeedByGear();
		
		
		
		
	}

}
