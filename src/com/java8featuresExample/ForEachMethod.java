package com.java8featuresExample;

import java.util.Arrays;
import java.util.List;

public class ForEachMethod {
	public static void main(String[] args) {
		List<Integer> values = Arrays.asList(10, 20, 30, 40, 50);
//		for(int i=0;i<values.size();i++) { // for loop for print the list
//			System.out.println(values.get(i));
//		}
//		for (int i : values) { // Enhanced for loop for print the list
//			System.out.println(i);
//		}
		// these types of loops are called External loops
		// but java 8 we have internal loop
		values.forEach(i -> System.out.println(i));// for each loop , is faster for large amount of data
		values.forEach(System.out::println);//method reference 
		
		
	}
}
