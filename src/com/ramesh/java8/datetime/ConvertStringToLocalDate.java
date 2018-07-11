package com.ramesh.java8.datetime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ConvertStringToLocalDate {

	private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
	private static final DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("d-MMM-yyyy");
	private static final DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("d/MM/yyyy");
	public static void main(String[] args) {
		
		System.out.println(formatter.format(LocalDate.parse("16/08/2016", formatter)));
        
        System.out.println(formatter1.format(LocalDate.parse("16-Aug-2016", formatter1)));
        
        System.out.println(formatter2.format(LocalDate.parse("16/08/2016", formatter2)));
	}
}
