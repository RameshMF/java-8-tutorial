package com.ramesh.java8.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class JLEComparatorExample {

	public static void main(String[] args) {

		List<Person> listOfPerson = new ArrayList<Person>();
		listOfPerson.add(new Person("abc", 27));
		listOfPerson.add(new Person("mno", 26));
		listOfPerson.add(new Person("pqr", 28));
		listOfPerson.add(new Person("xyz", 27));

		// Without lambda expression.
		// Sort list by age
		Comparator<Person> comparator = new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				return o1.getAge() - o2.getAge();
			}
		};

		Collections.sort(listOfPerson, comparator);

		System.out.println(" sort persons by age in ascending order");
		for (Person person : listOfPerson) {
			System.out.println(" Person name : " + person.getName());
		}

		// Witht lambda expression.
		// Sort list by age

		Collections.sort(listOfPerson, (Person o1, Person o2) -> {
			return o1.getAge() - o2.getAge();
		});
		// Use forEach method added in java 8
		System.out.println(" sort persons by age in ascending order");
		listOfPerson.forEach(
				(person) -> System.out.println(" Person name : " + person.getName()));
	}
}

class Person {
	private String name;
	private int age;

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}