package com.java8featuresExample.streamExample;

import java.util.stream.Stream;

public class StreamIterator {
	public static void main(String[] args) {

		Stream.iterate(1, element -> element + 1).filter(element -> element % 5 == 0).limit(5)
				.forEach(System.out::println);

		Stream.iterate(1, n -> n + 1).filter(n -> n % 4 == 0).limit(4).forEach(System.out::println);
	}

}
