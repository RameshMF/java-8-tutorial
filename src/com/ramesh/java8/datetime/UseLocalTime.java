package com.ramesh.java8.datetime;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class UseLocalTime {

    LocalTime getLocalTimeUsingFactoryOfMethod(int hour, int min, int seconds) {
        return LocalTime.of(hour, min, seconds);
    }

    LocalTime getLocalTimeUsingParseMethod(String timeRepresentation) {
        return LocalTime.parse(timeRepresentation);
    }

   //Obtains the current time from the system clock in the default time-zone. 
    private LocalTime getLocalTimeFromClock() {
        return LocalTime.now();
    }

    // Returns a copy of this time with the specified amount added. 
    LocalTime addAnHour(LocalTime localTime) {
        return localTime.plus(1, ChronoUnit.HOURS);
    }

    int getHourFromLocalTime(LocalTime localTime) {
        return localTime.getHour();
    }

    LocalTime getLocalTimeWithMinuteSetToValue(LocalTime localTime, int minute) {
        return localTime.withMinute(minute);
    }
    
    public static void main(String[] args) {
    	UseLocalTime localTime = new UseLocalTime();
    	
    	System.out.println("Current local time : " + localTime.getLocalTimeFromClock());
    	System.out.println(" LocalTime representing 08:30 AM \t: " + localTime.getLocalTimeUsingParseMethod("08:30"));
    	System.out.println("add an hour to current time : " + localTime.addAnHour(LocalTime.of(11, 11)));
	}
}
