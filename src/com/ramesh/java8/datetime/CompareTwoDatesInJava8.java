package com.ramesh.java8.datetime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

// In Java 8, you can use the new isBefore(), isAfter(), isEqual() and compareTo() to compare LocalDate, LocalTime and LocalDateTime.
public class CompareTwoDatesInJava8 {
	public static void main(String[] args) {

        DateTimeFormatter sdf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate date1 = LocalDate.of(2009, 12, 31);
        LocalDate date2 = LocalDate.of(2010, 01, 31);

        System.out.println("date1 : " + sdf.format(date1));
        System.out.println("date2 : " + sdf.format(date2));

        System.out.println("Is...");
        if (date1.isAfter(date2)) {
            System.out.println("Date1 is after Date2");
        }

        if (date1.isBefore(date2)) {
            System.out.println("Date1 is before Date2");
        }

        if (date1.isEqual(date2)) {
            System.out.println("Date1 is equal Date2");
        }

        System.out.println("CompareTo...");
        if (date1.compareTo(date2) > 0) {

            System.out.println("Date1 is after Date2");

        } else if (date1.compareTo(date2) < 0) {

            System.out.println("Date1 is before Date2");

        } else if (date1.compareTo(date2) == 0) {

            System.out.println("Date1 is equal to Date2");

        } else {

            System.out.println("How to get here?");

        }
    }
}

// http://www.mkyong.com/java/how-to-compare-dates-in-java/