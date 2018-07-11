package com.ramesh.java8.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import static java.time.temporal.ChronoUnit.YEARS;

import java.time.DayOfWeek;
import java.time.temporal.TemporalAdjusters;

import java.time.Duration;
import java.time.Instant;

public class DateTimeDemo {
	public static void main(String[] args) {

		// set the value for the date of birth
		LocalDate dateofBirth = LocalDate.of(1986, Month.APRIL, 06);
		System.out.println("Customer date of birth is " + dateofBirth);

		// retrieve the customer's age:
		LocalDate now = LocalDate.now();
		System.out.println("Customer now is " + dateofBirth.until(now, YEARS) + " years old.");

		// retrieve the system time and system date and time
		LocalTime time = LocalTime.now();
		System.out.println(" Time You logged in is " + time);
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println(" Date and time LocalDateTime You logged in is  " + dateTime);

		// manipulating the LocalDate class minus-prefixed method

		LocalDate policyStartdate = LocalDate.now().minusYears(4).minusMonths(2).minusDays(17);
		System.out.println("Policy Start Date : " + policyStartdate);

		// retrieve the number of installments paid to date

		int noofInstallmentsPaid = ((now.getYear()) - policyStartdate.getYear());
		System.out.println("No of Installments paid is " + noofInstallmentsPaid);

		/// retrieve the policy end date and the policy maturity date:

		LocalDate policyEnddate = policyStartdate.plusYears(23).plusMonths(11).plusDays(21);
		System.out.println("Policy End Date : " + policyEnddate);
		LocalDate policyMaturedate = policyEnddate.plusDays(1);
		System.out.println("Policy Matures on  : " + policyMaturedate);

		// code to calculate the closing balance:
		int openingBalance = 0;
		float premiumAmount = 35000;
		System.out.println("Premium Amount :" + premiumAmount);
		int monthlyInterest = (24 / 12);
		System.out.println("Monthly Interest Paid by company :" + monthlyInterest);
		int noofInstallments = 25;
		float closingBalance = ((openingBalance + premiumAmount) * noofInstallments);
		System.out.println("closingBalance without interest " + closingBalance);

		// code to calculate the interest rate:

		float interestRate = (float) ((Math.pow((noofInstallments / 4), monthlyInterest)) / monthlyInterest)
				* (1 + monthlyInterest);
		System.out.println("Overall Interest Rate paid for 25 years is " + interestRate);

		// calculate the number of installments paid by the customer at the age
		// of 40:
		int yearAtForty = (dateofBirth.getYear()) + 40;
		System.out.println("Customer will be 40  at  " + yearAtForty);
		int noOfPremiumAtForty = yearAtForty - (policyStartdate.getYear());
		System.out.println("No of Premium paid by customer at the age of 40 years is " + noOfPremiumAtForty);

		// code to calculate the interest rate paid when the customer is 40
		// years old:
		float interestAtForty = (float) ((Math.pow((noOfPremiumAtForty / 4), monthlyInterest)) / monthlyInterest)
				* (1 + monthlyInterest);
		System.out.println("Interest received by customer at the age of 40 is :" + interestAtForty + "%");

		// code to calculate the maturity amount:
		float maturityAmount = interestRate * premiumAmount;
		System.out.println("Maturity Amount is  " + maturityAmount);

		// code to calculate the interest amount gained:
		float interestAmount = maturityAmount - closingBalance;
		System.out.println("Interest Amount gained is " + interestAmount);

		// code to calculate the payment date of the previous installment:
		LocalDate lastinstallmentsPaidDate = LocalDate.now().minusMonths(2).minusDays(15);
		System.out.println("Last Premium  paid Date  :" + lastinstallmentsPaidDate);

		// code to calculate the next installment date:
		LocalDate NextinstallmentDate = lastinstallmentsPaidDate.plusYears(1).withDayOfMonth(5);
		System.out.println("Next Premium Date to be paid :" + NextinstallmentDate);

		// code to calculate the due date of the premium payment:
		LocalDate dueDateofPremium = NextinstallmentDate.with(TemporalAdjusters.dayOfWeekInMonth(3, DayOfWeek.MONDAY));
		System.out.println("Due date to pay the premium is  " + dueDateofPremium);

		// code to calculate the policy's duration:
		Duration h = Duration.ofDays(2);
		System.out.println("Duration of policy being active is " + h + " Hours");

		// code to calculate the instant class date and time:
		Instant start = Instant.now().minusSeconds(160);
		System.out.println("Instant Start" + start);
		Instant end = Instant.now().plusSeconds(60).minusNanos(2);
		System.out.println("Instant end" + end);

		// code to calculate the time difference by using the duration class:
		Duration a = Duration.between(start, end);
		System.out.println("Duration of the site being active is " + a + "seconds");

	}
}
