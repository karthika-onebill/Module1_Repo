package com.onebill.java_basics;

import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;

public class Date_Class {

	public static void main(String[] args) {
		
		LocalDate today= LocalDate.now();
		System.out.println("Current Date is : "+today);
		LocalDate someDay = LocalDate.of(2021, Month.APRIL, 2);
		System.out.println("Some date is : "+someDay);
		LocalDate from = LocalDate.from(someDay);
		System.out.println(" From date : "+from);
		LocalDate zoneDate= LocalDate.now(ZoneId.of("Asia/Kolkata"));
		System.out.println("Zonal date : "+zoneDate);
		LocalDate dateFromEpoch = LocalDate.ofEpochDay(365);
		System.out.println(dateFromEpoch);
		LocalDate error = LocalDate.of(2021, Month.FEBRUARY, 29);
		System.out.println("Invalidate is : "+error);
	}

}
