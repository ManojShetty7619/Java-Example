package com.java8featuresExample.streamExample;

import java.util.*;
import java.util.stream.Collectors;

class Product {
	int id;
	String name;
	float price;

	public Product(int id, String name, float price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public int getId() {
		return id;

	}

	public String getName() {
		return name;

	}

	public float getPrice() {
		return price;

	}
}

public class JavaStreamExample {
	public static void main(String[] args) {
		List<Product> productsList = new ArrayList<Product>();
		// Adding Products
		productsList.add(new Product(1, "HP Laptop", 25000f));
		productsList.add(new Product(2, "Dell Laptop", 30000f));
		productsList.add(new Product(3, "Lenevo Laptop", 28000f));
		productsList.add(new Product(4, "Sony Laptop", 28000f));
		productsList.add(new Product(5, "Apple Laptop", 90000f));
		// max() method to get max Product price
		Product productA = productsList.stream().max((product1, product2) -> product1.price > product2.price ? 1 : -1)
				.get();
		System.out.println(productA.price);
		// min() method to get min Product price
		Product productB = productsList.stream().min((product1, product2) -> product1.price > product2.price ? 1 : -1)
				.get();
		System.out.println(productB.price);
		// method reference

		List<Float> productPriceList = productsList.stream().filter(p -> p.price < 30000) // filter data
				.map(Product::getPrice)// fetching price by referring getPrice method
				.collect(Collectors.toList());
		System.out.println("Filter data :" + productPriceList);

		List<Float> listA=productsList.stream().filter(a->a.price<=28000).map(Product ::getPrice).collect(Collectors.toList());
		System.out.println(listA);
	}
}
