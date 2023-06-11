package com.collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.TreeMap;

public class Map {

	public static void main(String[] args) {
		// Hash map takes key value pair
		// Does not follow insertion order
		// It will replace the key value for the next same key(takes the latest value)
		// It allows null value
		HashMap<Integer, String> hashMapExample = new HashMap<>();
		hashMapExample.put(10, "ten");
		hashMapExample.put(20, "twenty");
		hashMapExample.put(40, "fourty");
		hashMapExample.put(30, "thirty");
		hashMapExample.put(80, "eighty");
		hashMapExample.put(90, "ninty");
		hashMapExample.put(50, "fifty");
		hashMapExample.put(60, "sixty");
		hashMapExample.put(70, "seventy");
		hashMapExample.put(100, "hundred");
		hashMapExample.put(100, "repeated");
		hashMapExample.put(null, "hundred");
		hashMapExample.put(1, null);
		System.out.println("HashMap Example---->" + hashMapExample);

		// Hash table takes key value pair
		// Does not follow insertion order
		// it sorts the data in decrement order in such a way that it counts till
		// 0-22,and after that
		// it counts as 23-45 as again 0-22. But we if consider both 22 and 45 , 22 is
		// greater.
		// It will replace the key value for the next same key(takes the latest value)
		// It does not allows null value
		Hashtable<Integer, String> hashTableExample = new Hashtable<>();
		hashTableExample.put(11, "ten");
		hashTableExample.put(22, "twenty");
		hashTableExample.put(4, "fourty");
		hashTableExample.put(35, "thirty");
		hashTableExample.put(8, "eighty");
		hashTableExample.put(9, "ninty");
		hashTableExample.put(44, "sixty");
		hashTableExample.put(45, "four");
		hashTableExample.put(7, "seventy");
		hashTableExample.put(10, "hundred");
		hashTableExample.put(1, "repeated");
		// hashTableExample.put(null, "hundred");
		// hashTableExample.put(1, null)
		System.out.println("HashTable Example---->" + hashTableExample);

		Hashtable<Integer, String> hashTableExample1 = new Hashtable<>();
		hashTableExample1.put(2, "two");
		hashTableExample1.put(7, "seven");
		hashTableExample1.put(8, "eight");
		hashTableExample1.put(1, "one");
		hashTableExample1.put(3, "three");
		hashTableExample1.put(4, "four");
		hashTableExample1.put(5, "five");
		hashTableExample1.put(6, "six");
		hashTableExample1.put(9, "nine");
		System.out.println("HashTable Example2---->" + hashTableExample1);

		// Tree Map does not follow insertion order
		// Here sorting is done in the increment order
		TreeMap<Integer, String> treeMapExample = new TreeMap<>();
		treeMapExample.put(11, "ten");
		treeMapExample.put(22, "twenty");
		treeMapExample.put(4, "fourty");
		treeMapExample.put(35, "thirty");
		treeMapExample.put(8, "eighty");
		treeMapExample.put(9, "ninty");
		treeMapExample.put(44, "sixty");
		treeMapExample.put(45, "fifty");
		treeMapExample.put(7, "seventy");
		treeMapExample.put(10, "hundred");
		treeMapExample.put(1, "repeated");
		System.out.println("TreeMap Example--->" + treeMapExample);

	}

}
