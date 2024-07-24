package com.rays.javaoop.encapsulation;

public class Automobile {
	private String colour;
	private int speed;
	private int gear;
	private String make;

	public void setcolour(String colour) {
		this.colour = colour;
	}

	public String getcolour() {
		return this.colour;
	}

	public void setspeed(int speed) {
		this.speed = speed;
	}

	public int getspeed() {
		return this.speed;
	}

	public void setgear(int gear) {
		this.gear = gear;

	}

	public int getgear() {
		return this.gear;
	}

	public void setmake(String make) {
		this.make = make;

	}

	public String getmake() {
		return this.make;
	}
	public void getSpeedByGear() {
	    switch (this.gear) {
	        case 1:
	            System.out.println("Speed is from 0 - 20");
	            break;

	        case 2:
	            System.out.println("Speed is from 21 - 40");
	            break;

	        case 3:
	            System.out.println("Speed is from 41 - 60");
	            break;

	        case 4:
	            System.out.println("Speed is from 61 - 80");
	            break;

	        case 5:
	            System.out.println("Speed is from 81 - 120");
	            break;

	        case 0:
	            System.out.println("In neutral state.");
	            break;

	        default:
	            throw new IllegalArgumentException("Invalid Gear. Please input gear from 0 - 5");

	    }
	}
}
