package com.onebill.java_basics;

import java.time.LocalTime;
import java.time.ZoneId;

public class Time_Class {

	public static void main(String[] args) {
		
		LocalTime currenttime = LocalTime.now();
		System.out.println("Current time is : "+currenttime);
		LocalTime specifictime = LocalTime.of(9, 23);
		System.out.println("Specific time is :"+specifictime);
		LocalTime zonalTime = LocalTime.now(ZoneId.of("Europe/Paris"));
		System.out.println("Zonal time is : "+zonalTime);
		LocalTime timebasedonsecs = LocalTime.ofSecondOfDay(45000);
		System.out.println("Seconds of the day : "+timebasedonsecs);
		LocalTime error = LocalTime.of(24, 23);
		System.out.println("Inavlid time is :"+error);
	}

}
