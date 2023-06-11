package com.java8featuresExample.lambdaExpession;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Product {
	int id;
	String name;
	Float price;

	public Product(int id, String name, float price) {
		this.id = id;
		this.name = name;
		this.price = price;

	}
}

public class ComparatorExample {
	public static void main(String[] args) {
		List<Product> list = new ArrayList<Product>();
		list.add(new Product(1, "HP Laptop", 25000f));
		list.add(new Product(2, "Keyboard", 400f));
		list.add(new Product(3, "Dell mouse", 200f));
		System.out.println("Sorting on the basis of name...:");
		Collections.sort(list, (p1, p2) -> {
			return p1.name.compareTo(p2.name);
		});
//		Collections.sort(list, (p1, p2) -> {
//			return p1.name.compareTo(p2.name);
//		})
		for (Product p : list) {
			System.out.println(p.id + "  " + p.name + "  " + p.price);

		}
	}

}
