package com.rays.dateclass;
 import java.time.LocalDate;
 import java.time.Period;
 

public class AgeCalculator {
	public static void main(String[] args) {
		LocalDate birthdate = LocalDate.of(1994, 10, 11);
		
		LocalDate currentDate = LocalDate.now();
		
		Period age = Period.between(birthdate, currentDate);
		
		int year = age.getYears();
		int month = age.getMonths();
		int days = age.getDays();
		
		System.out.println(" AGE :"+ year + "years,"+ month +" months, "+ days + " days,");
	}
		
		
	}


