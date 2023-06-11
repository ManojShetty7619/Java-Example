

package com.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class List {
	public static void main(String[] args) {
		// Array list follow insertion order. Easy to get the data.
		//Duplicate data is allowed 
		//null is allowed
		ArrayList listExample1 = new ArrayList<>();
		listExample1.add(10);
		listExample1.add(20);
		listExample1.add("one");
		listExample1.add("two");
		listExample1.add(20);
		listExample1.add(null);
		listExample1.add(null);
		System.out.println("ArrayList1--->" + listExample1);

		ArrayList<String> listExample2 = new ArrayList<>();
		listExample2.add("one");
		listExample2.add("two");
		listExample2.add("three");
		listExample2.add("four");
		System.out.println("ArrayList2----->" + listExample2);

		listExample2.addAll(listExample1);
		System.out.println("Adding of two Arrays-->" + listExample2);
		listExample2.remove(2);
		System.out.println("ArrayList after deletig-->" + listExample2);

		// Linked list follow insertion order. Easy to delete the data
		//Duplicate data is allowed 
		//null is allowed
		LinkedList<String> linkedListExample = new LinkedList<>();
		linkedListExample.add("one");
		linkedListExample.add("two");
		linkedListExample.add("three");
		linkedListExample.add("four");
		linkedListExample.add("three");
		linkedListExample.add(null);
		linkedListExample.add(5,"one");

		System.out.println("Linked list example-->" + linkedListExample);
		linkedListExample.remove(1);
		System.out.println("Linked list after removig-->" + linkedListExample);
		
		// Vector is same as Array list but its Synchronized.
		//Duplicate data is allowed 
		//null is allowed
		Vector<String> vector = new Vector<>();
		vector.add("one");
		vector.add("three");
		vector.add("two");
		vector.add("four");
		vector.add("four");
		vector.add(null);
		System.out.println("Vector example--->" + vector);
		vector.remove(2);
		System.out.println("Vector example after remove --->" + vector);
		
		Vector<Integer> vec= new Vector<>();
		vec.add(5);
		vec.add(6);
		vec.add(3);
		System.out.println("Vector ------"+vec);

	}

}
