package com.ramesh.java8.functionalInterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

// Consumer accepts a generified argument and returns nothing. It is a function that is representing side effects.
public class ConsumersExample {

	public static void main(String[] args) {

		// For instance, let’s greet everybody in a list of names by printing the greeting
		// in the console. The lambda passed to the List.forEach method implements the
		// Consumer functional interface:
		List<Person> listOfPerson = new ArrayList<Person>();
		listOfPerson.add(new Person("abc", 27));
		listOfPerson.add(new Person("mno", 26));
		listOfPerson.add(new Person("pqr", 28));
		listOfPerson.add(new Person("xyz", 27));

		listOfPerson.forEach((person) -> {
			System.out.println(" Person name : " + person.getName());
			System.out.println(" Person age : " + person.getAge());
		});
		
		
		// Second example
		Consumer<Person> consumer = (person) -> {
			System.out.println(person.getName());
			System.out.println(person.getAge());
		};
		consumer.accept(new Person("Ramesh", 30));
	}
}
