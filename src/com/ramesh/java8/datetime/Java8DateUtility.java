package com.ramesh.java8.datetime;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.MonthDay;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.Calendar;
import java.util.Date;

//https://javarevisited.blogspot.com/2015/03/20-examples-of-date-and-time-api-from-Java8.html
public final class Java8DateUtility {

	public static LocalDate getLocalDateFromClock() {
		LocalDate localDate = LocalDate.now();
		System.out.println("Today's Local date : " + localDate);
		return localDate;
	}

	public static LocalDate getNextDay(LocalDate localDate) {
		return localDate.plusDays(1);
	}

	public static LocalDate getPreviousDay(LocalDate localDate) {
		return localDate.minus(1, ChronoUnit.DAYS);
	}

	public static DayOfWeek getDayOfWeek(LocalDate localDate) {
		DayOfWeek day = localDate.getDayOfWeek();
		return day;
	}

	public static LocalDate getFirstDayOfMonth() {
		LocalDate firstDayOfMonth = LocalDate.now().with(TemporalAdjusters.firstDayOfMonth());
		return firstDayOfMonth;
	}

	public static LocalDateTime getStartOfDay(LocalDate localDate) {
		LocalDateTime startofDay = localDate.atStartOfDay();
		return startofDay;
	}

	public static void printCurrentDayMonthAndYear() {
		LocalDate today = LocalDate.now();
		int year = today.getYear();
		int month = today.getMonthValue();
		int day = today.getDayOfMonth();
		System.out.printf("Year : %d Month : %d day : %d \t %n", year, month, day);
	}

	public static LocalDate getParticularDate() {
		LocalDate dateOfBirth = LocalDate.of(2010, 01, 14);
		System.out.println("Your Date of birth is : " + dateOfBirth);
		return dateOfBirth;
	}

	public static boolean checkDateEquals(LocalDate date, LocalDate today) {
		if (date.equals(today)) {
			System.out.printf("Today %s and date1 %s are same date %n", today, date);
			return true;
		}
		return false;
	}

	public static void recurringDate(LocalDate today) {
		LocalDate dateOfBirth = LocalDate.of(2010, 01, 14);
		MonthDay birthday = MonthDay.of(dateOfBirth.getMonth(), dateOfBirth.getDayOfMonth());
		MonthDay currentMonthDay = MonthDay.from(today);
		if (currentMonthDay.equals(birthday)) {
			System.out.println("Many Many happy returns of the day !!");
		} else {
			System.out.println("Sorry, today is not your birthday");
		}
	}

	public static LocalTime getCurrentTime() {
		LocalTime time = LocalTime.now();
		System.out.println("local time now : " + time);
		return time;
	}

	public static LocalTime addHoursToTime(int hours) {
		LocalTime time = LocalTime.now();
		LocalTime newTime = time.plusHours(hours); // adding two hours
		System.out.println("Time after 2 hours : " + newTime);
		return newTime;
	}

	public static void findDateAfterWeek() {
		LocalDate today = LocalDate.now();
		LocalDate nextWeek = today.plus(1, ChronoUnit.WEEKS);
		System.out.println("Today is : " + today);
		System.out.println("Date after 1 week : " + nextWeek);
	}

	public static ZonedDateTime timeZone(String timeZone) {
		ZoneId america = ZoneId.of(timeZone);
		LocalDateTime localtDateAndTime = LocalDateTime.now();
		ZonedDateTime dateAndTimeInNewYork = ZonedDateTime.of(localtDateAndTime, america);
		System.out.println("Current date and time in a particular timezone : " + dateAndTimeInNewYork);
		return dateAndTimeInNewYork;
	}

	public static void checkLeafYear() {
		LocalDate today = LocalDate.now();
		if (today.isLeapYear()) {
			System.out.println("This year is Leap year");
		} else {
			System.out.println("2014 is not a Leap year");
		}
	}

	public static Instant getTimeStamp() {
		Instant timestamp = Instant.now();
		System.out.println("What is value of this instant " + timestamp);
		return timestamp;
	}

	public static void compareTwoDates(LocalDate date1, LocalDate date2) {
		if (date1.compareTo(date2) > 0) {
			System.out.println("Date1 is after Date2");
		} else if (date1.compareTo(date2) < 0) {
			System.out.println("Date1 is before Date2");
		}
	}

	public static LocalTime getLocalTimeUsingFactoryOfMethod(int hour, int min, int seconds) {
		return LocalTime.of(hour, min, seconds);
	}

	public static ZonedDateTime getZonedDateTime(LocalDateTime localDateTime, ZoneId zoneId) {
		return ZonedDateTime.of(localDateTime, zoneId);
	}

	// Returns a copy of this time with the specified amount added.
	public static LocalTime modifyDates(LocalTime localTime, Duration duration) {
		return localTime.plus(duration);
	}

	// Obtains a Duration representing the duration between two temporal
	// objects.
	public static Duration getDifferenceBetweenDates(LocalTime localTime1, LocalTime localTime2) {
		return Duration.between(localTime1, localTime2);
	}

	public static LocalDateTime getLocalDateTimeUsingParseMethod(String representation) {
		return LocalDateTime.parse(representation);
	}

	public static LocalDateTime convertDateToLocalDate(Date date) {
		return LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault());
	}

	public static LocalDateTime convertDateToLocalDate(Calendar calendar) {
		return LocalDateTime.ofInstant(calendar.toInstant(), ZoneId.systemDefault());
	}
}
