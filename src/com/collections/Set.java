package com.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Set {

	public static void main(String[] args) {
		// HashSet doesn't follow insertion order
		// Duplicate is not allowed
		// null is allowed
		HashSet hashsetExample = new HashSet<>();
		hashsetExample.add(10);
		hashsetExample.add(20);
		hashsetExample.add(30);
		hashsetExample.add("ten");
		hashsetExample.add("twenty");
		hashsetExample.add("thirty");
		hashsetExample.add("fourty");
		hashsetExample.add(30);
		hashsetExample.add(null);
		System.out.println("Hashset Example--->" + hashsetExample);

		HashSet<String> hashSetExample2 = new HashSet<>();
		hashSetExample2.add("ten");
		hashSetExample2.add("one");
		hashSetExample2.add("two");
		hashSetExample2.add("three");
		Iterator<String> it =hashSetExample2.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("Hashset Example 2--->" + hashSetExample2);
		hashSetExample2.addAll(hashsetExample);
		System.out.println("hashSet after adding---->" + hashSetExample2);

		LinkedHashSet<String> linkedHashsetExample = new LinkedHashSet<>();
		// Linked HashSet follow insertion order
		// Duplicate is not allowed
		// null is allowed

		linkedHashsetExample.add("one");
		linkedHashsetExample.add("two");
		linkedHashsetExample.add("three");
		linkedHashsetExample.add("four");
		linkedHashsetExample.add("four");
		linkedHashsetExample.add(null);
		System.out.println("Linked HashSet Example-->" + linkedHashsetExample);
		// Need to declare the data types in the starting
		// Duplicate is not allowed
		// null is not allowed
		// arranges in increment order : sorting is done here
		TreeSet<String> treeSetExample = new TreeSet<>();
		treeSetExample.add("a");
		treeSetExample.add("c");
		treeSetExample.add("d");
		treeSetExample.add("b");
		treeSetExample.add("e");
		// treeSetExample.add(null);
		System.out.println("TreeSet Example--->" + treeSetExample);

		TreeSet<Integer> treeSetExample1 = new TreeSet<>();
		treeSetExample1.add(1);
		treeSetExample1.add(3);
		treeSetExample1.add(2);
		treeSetExample1.add(5);
		treeSetExample1.add(4);
		System.out.println("TreeSet Example2--->" + treeSetExample1);

	}

}
