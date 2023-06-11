package com.java8featuresExample.optionalClass;

import java.util.Optional;

public class OptionalExample2 {
	public static void main(String[] args) {
		String[] str = new String[10];
		str[5] = "HOW ARE YOU";// setting value for 5th index
		Optional<String> nullCheck = Optional.ofNullable(str[5]);
		nullCheck.ifPresent(System.out::println);// printing value by using method reference
		System.out.println(nullCheck.get());// Printing the values by using get method
		System.out.println(str[5].toLowerCase());// change to lower case
	}

}
			