package com.stringExamples;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class B {

	public static void main(String[] args) {
		String fruit = "mango apple mango mango apple apple";
		
		List<String> list = Arrays.asList(fruit);
		
		java.util.Map<String, Long> fruitdetails = list.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(fruitdetails);
	}
}
