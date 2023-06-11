package com.java8featuresExample.optionalClass;

import java.util.Optional;

public class OptionalExample1 {
	public static void main(String[] args) {

		String[] str = new String[10];
		str[5] = "ABCDEF";// setting value for 5th index
		Optional<String> checkNull = Optional.ofNullable(str[5]);
		if (checkNull.isPresent()) {// check for value is present or not
			String lowercaseString = str[5].toLowerCase(); // upper case to lower case
			System.out.println("Lower case String :" + lowercaseString);
		} else {
			System.out.println("String value is not present");
		}
	}
}