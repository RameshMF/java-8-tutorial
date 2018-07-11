package com.ramesh.java8.datetime;

import java.time.DateTimeException;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
/*
 * This example uses ZonedDateTime to calculate the arrival time of
 * a flight that leaves from San Francisco and arrives in Tokyo.
 * The flight is 10 hours, 50 minutes long. Formatters are used to
 * print the departure and arrival times.
 */

public class FlightZoneDateTimeExample {
    public static void main(String[] args) {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("MMM d yyyy  hh:mm a");

        // Leaving from San Francisco on July 20, 2013, at 7:30 p.m.
        LocalDateTime leaving = LocalDateTime.of(2013, Month.JULY, 20, 19, 30);
        ZoneId leavingZone = ZoneId.of("America/Los_Angeles"); 
        ZonedDateTime departure = ZonedDateTime.of(leaving, leavingZone);

        try {
            String out1 = departure.format(format);
            System.out.printf("LEAVING:  %s (%s)%n", out1, leavingZone);
        } catch (DateTimeException exc) {
            System.out.printf("%s can't be formatted!%n", departure);
            throw exc;
        }

        // Flight is 10 hours and 50 minutes, or 650 minutes
        ZoneId arrivingZone = ZoneId.of("Asia/Tokyo"); 
        ZonedDateTime arrival = departure.withZoneSameInstant(arrivingZone)
                                         .plusMinutes(650);

        try {
            String out2 = arrival.format(format);
            System.out.printf("ARRIVING: %s (%s)%n", out2, arrivingZone);
        } catch (DateTimeException exc) {
            System.out.printf("%s can't be formatted!%n", arrival);
            throw exc;
        }

        if (arrivingZone.getRules().isDaylightSavings(arrival.toInstant())) 
            System.out.printf("  (%s daylight saving time will be in effect.)%n",
                              arrivingZone);
        else
            System.out.printf("  (%s standard time will be in effect.)%n",
                              arrivingZone);
    }
}
