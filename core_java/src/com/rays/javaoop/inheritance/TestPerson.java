package com.rays.javaoop.inheritance;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestPerson {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");

		Person p = new Person();

		Date dob = sdf.parse("2002/01/25");

		p.setName("Sushobhit");
		p.setAddress("Indore");
		p.setDateofbirth(dob);
		
		System.out.println(sdf.format(p.getDateofbirth()));

	}

}
