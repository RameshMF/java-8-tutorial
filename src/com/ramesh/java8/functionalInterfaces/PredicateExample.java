package com.ramesh.java8.functionalInterfaces;

import java.util.function.Predicate;

// We need a function for checking a condition. A Predicate is one such function accepting a single argument to evaluate to a boolean result.
// It has a single method test which returns the boolean value. 
public class PredicateExample {

	public static void main(String[] args) {
		
		Predicate<Person> predicate = (person) -> person.getAge() > 28; 
		boolean result = predicate.test(new Person("ramesh", 29));
		System.out.println(result);
	}
}


