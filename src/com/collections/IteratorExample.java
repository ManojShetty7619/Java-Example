package com.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {

	public static void main(String[] args) {
		ArrayList<String> animal = new ArrayList<>();
		animal.add("dog");
		animal.add("cat");
		animal.add("cow");
		animal.add("parrot");
		animal.add("sheep");
		System.out.println("animal list :" + animal);
		Iterator<String> it1 = animal.iterator();// get the iterator
		System.out.println("first animal :" + it1.next());// print the first item
		while (it1.hasNext())
			System.out.println(it1.next() + " ");// print all the items
		System.out.println("----------------");
		// removing items from collection
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);

		numbers.add(6);
		numbers.add(7);
		numbers.add(8);
		System.out.println("list of numbers :" + numbers);
		Iterator<Integer> it2 = numbers.iterator();// get the iterator
		while (it2.hasNext()) {// looping through collection
			// System.out.println(it2.next());// print the all looped element

			Integer i = it2.next();

			if (i < 5) {
				it2.remove();
				//System.out.println(it2.next());
			}

			System.out.println("----"+i);
			
		}
		System.out.println(numbers);// print the numbers

	}
}
