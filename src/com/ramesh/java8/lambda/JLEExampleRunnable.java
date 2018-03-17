package com.ramesh.java8.lambda;

public class JLEExampleRunnable {

	public static void main(String[] args) {
		
		//without lambda, Runnable implementation using anonymous class  
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				System.out.println(" Runnable example without lambda exp.");
			}
		};
		Thread thread = new Thread(runnable);
		thread.run();
		
		 //with lambda 
		Runnable withLambda = () -> System.out.println(" Runnable example with lambda exp.");
		withLambda.run();
		
	}
}
