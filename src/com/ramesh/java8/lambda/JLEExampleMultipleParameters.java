package com.ramesh.java8.lambda;

interface Addable{  
    int add(int a,int b);  
}  
public class JLEExampleMultipleParameters {

	public static void main(String[] args) {
		
		// without lambda expression
		Addable addable = new Addable() {
			@Override
			public int add(int a, int b) {
				return a + b;
			}
		};
		addable.add(10, 20);
		
		// with lambda expression
		 // Multiple parameters in lambda expression  
        Addable withLambda = (a,b)->(a+b);  
        System.out.println(withLambda.add(10,20));  
          
        // Multiple parameters with data type in lambda expression  
        Addable withLambdaD = (int a,int b) -> (a+b);  
        System.out.println(withLambdaD.add(100,200));  
	}
	
}
