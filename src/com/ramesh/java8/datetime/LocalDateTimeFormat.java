package com.ramesh.java8.datetime;

import java.time.Instant;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeFormat {
	
public static void main(String[] args) {
		
		LocalDateTime dateTime = LocalDateTime.now();
		
		//default format
		System.out.println("Default format of LocalDateTime="+dateTime);
		
		//specific format
		System.out.println(dateTime.format(DateTimeFormatter.ofPattern("d::MMM::uuuu HH::mm::ss")));
		
		System.out.println(dateTime.format(DateTimeFormatter.BASIC_ISO_DATE));
		
		Instant timestamp = Instant.now();
		
		//default format
		System.out.println("Default format of Instant="+timestamp);
		
		//Parse examples
		LocalDateTime dt = LocalDateTime.parse("27::Apr::2014 21::39::48",
				DateTimeFormatter.ofPattern("d::MMM::uuuu HH::mm::ss"));
		System.out.println("Default format after parsing = "+dt);
	}
}
