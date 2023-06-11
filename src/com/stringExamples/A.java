package com.stringExamples;

import java.util.ArrayList;
import java.util.List;

class Fruit {
	String fruits;

	public Fruit(String fruits) {
		super();
		this.fruits = fruits;
	}

}

public class A {

	public static void main(String[] args) {
		List<Fruit> fruitDetails = new ArrayList<Fruit>();

		fruitDetails.add(new Fruit("mango"));
		fruitDetails.add(new Fruit("mango"));
		fruitDetails.add(new Fruit("apple"));
		fruitDetails.add(new Fruit("apple"));
		long count = fruitDetails.stream().filter(f -> f.fruits == "mango").count();
		System.out.println("mango : "+count);
	}

}
