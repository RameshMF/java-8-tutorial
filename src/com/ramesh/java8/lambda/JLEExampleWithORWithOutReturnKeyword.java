package com.ramesh.java8.lambda;

interface Arithmatic {
	int add(int a, int b);
}

/**
 * In Java lambda expression, if there is only one statement, you may or may not use return keyword. You must use return keyword when lambda expression contains multiple statements.
 * @author RAMESH
 *
 */
public class JLEExampleWithORWithOutReturnKeyword {

	public static void main(String[] args) {

		// without lambda expression
		Arithmatic addable = new Arithmatic() {
			@Override
			public int add(int a, int b) {
				return a + b;
			}
		};
		addable.add(10, 20);

		// Lambda expression without return keyword.
		Arithmatic withLambda = (a, b) -> (a + b);
		System.out.println(withLambda.add(10, 20));

		// Lambda expression with return keyword.
		Arithmatic arithmatic = (int a, int b) -> {
			return (a + b);
		};
		System.out.println(arithmatic.add(100, 200));
	}

}
