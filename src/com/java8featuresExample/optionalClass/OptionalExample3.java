package com.java8featuresExample.optionalClass;

import java.util.Optional;

public class OptionalExample3 {
	public static void main(String[] args) {
		String[] str = new String[10];
		str[5] = "WHAT ARE YOU DOING";// setting values for 5th index
		Optional<String> empty = Optional.empty();// it returns an empty instance of optional class
		System.out.println("empty :" + empty);
		System.out.println("--------------------");
		Optional<String> value = Optional.of(str[5]);// it returns non empty optional
		System.out.println("Value :" + value);
		// if value is present, it returns the Optional otherwise it returns an empty
		// Optional
		System.out.println("Filtered value :" + value.filter((s) -> s.equals("abc")));
		System.out.println("Filtered value :" + value.filter((s) -> s.equals("WHAT ARE YOU DOING")));
		System.out.println("-----------------");
		// it returns value of an Optional .if value is not preset, it throws an
		// NoSuchelementException
		System.out.println("Getting value :" + value.get());
		// IT RETURNS HASH CODE OF THE VALUE
		System.out.println("Getting hashCode :" + value.hashCode());
		// it returns true if value is present, otherwise false
		System.out.println("Is value present :" + value.isPresent());
		// it returns non-empty Optional if value is present,otherwise returns an empty
		// Optional
		System.out.println("Nullable Optional :" + Optional.ofNullable(str[5]));
		System.out.println("--------------------");
		// it returns value if available.otherwise returns specified value
		System.out.println("orElse :" + value.orElse("value is not present"));
		System.out.println("orElse :" + empty.orElse("value is not present"));
		// printing the value by using method reference
		value.ifPresent(System.out::println);
	}

}
