package com.ramesh.java8.datetime;

import java.time.LocalDate;

import java.time.format.DateTimeFormatter;

public class LocalDateFormat {
	private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
	private static final DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("d-MMM-yyyy");
	private static final DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("d/MM/yyyy");
	public static void main(String[] args) {
		//default format
		System.out.println("Default format of LocalDate = " + LocalDate.now());
				
		// The ISO date formatter that formats or parses a date without an
	     // offset, such as '20111203'
		LocalDate date = LocalDate.now();
		
		System.out.println(date.format(DateTimeFormatter.BASIC_ISO_DATE));
		
		System.out.println(date.format(DateTimeFormatter.ISO_DATE));
		
		System.out.println(formatter.format(LocalDate.parse("16/08/2016", formatter)));
        
        System.out.println(formatter1.format(LocalDate.parse("16-Aug-2016", formatter1)));
        
        System.out.println(formatter2.format(LocalDate.parse("16/08/2016", formatter2)));
	}
}
