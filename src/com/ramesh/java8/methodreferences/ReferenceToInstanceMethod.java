package com.ramesh.java8.methodreferences;

// Syntex : containingObject::instanceMethodName 
public class ReferenceToInstanceMethod {

	public void saySomething() {
		System.out.println("Hello, this is non-static method.");
	}

	public static void main(String[] args) {
		// Creating object
		ReferenceToInstanceMethod methodReference = new ReferenceToInstanceMethod();
		// Referring non-static method using reference
		Sayable sayable = methodReference::saySomething;
		// Calling interface method
		sayable.say();
		// Referring non-static method using anonymous object
		
		// You can use  anonymous object also
		Sayable sayable2 = new ReferenceToInstanceMethod()::saySomething; 
		// Calling interface method
		sayable2.say();
	}
}

interface Sayable {
	void say();
}