package com.ramesh.java8.functionalInterfaces;

import java.util.function.Supplier;

public class SuppliersExample {

	public static void main(String[] args) {
		
		Supplier<Person> supplier = () -> { 
			return new Person("Ramesh", 30 );
		};
		
        Person p = supplier.get();
        System.out.println("Person Detail:\n" + p.getName() + ", " + p.getAge());
	}
}
