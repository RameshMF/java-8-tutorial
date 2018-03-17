package com.ramesh.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaExamples {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");

		/*Collections.sort(names, new Comparator<String>() {
		    @Override
		    public int compare(String a, String b) {
		        return a.compareTo(b);
		    }
		});*/
		
		Collections.sort(names, (a, b) -> a.compareTo(b));
		
		for(String str : names){
			System.out.println(str);
		}
	}
}
