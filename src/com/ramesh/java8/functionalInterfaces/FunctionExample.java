package com.ramesh.java8.functionalInterfaces;

import java.util.function.Function;

// A Function is a functional interface whose sole purpose is to return any result by working on a single input argument.
//It represents a function that accepts one argument and returns a result.
public class FunctionExample {

	public static void main(String[] args) {
		// convert centigrade to fahrenheit
		Function<Integer,Double> centigradeToFahrenheitInt = x -> new Double((x*9/5)+32);
		System.out.println("Centigrade to Fahrenheit: "+centigradeToFahrenheitInt.apply(100));

		// String to an integer
		Function<String, Integer> stringToInt = x -> Integer.valueOf(x);
		System.out.println(" String to Int: " + stringToInt.apply("4"));
		
		
		Function<PersonEntity, PersonDTO> function = (entity) -> {
			return new PersonDTO(entity.getName(), entity.getAge());
		};
		PersonDTO personDTO = function.apply(new PersonEntity("ramesh", 20));
		System.out.println(personDTO.getName());
		System.out.println(personDTO.getAge());
	}
}

class PersonEntity {
	private String name;
	private int age;

	public PersonEntity(String name, int age) {
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

class PersonDTO {
	private String name;
	private int age;

	public PersonDTO(String name, int age) {
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