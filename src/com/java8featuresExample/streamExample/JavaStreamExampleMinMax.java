package com.java8featuresExample.streamExample;

import java.util.*;

class ProductA {
	int id;
	String name;
	float price;

	public ProductA(int id, String name, float price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
}

public class JavaStreamExampleMinMax {
	public static void main(String[] args) {
		List<ProductA> productsList = new ArrayList<ProductA>();
		// Adding Products
		productsList.add(new ProductA(1, "HP Laptop", 25000f));
		productsList.add(new ProductA(2, "Dell Laptop", 30000f));
		productsList.add(new ProductA(3, "Lenevo Laptop", 28000f));
		productsList.add(new ProductA(4, "Sony Laptop", 28000f));
		productsList.add(new ProductA(5, "Apple Laptop", 90000f));
		// max() method to get max Product price
		ProductA productA = productsList.stream().max((product1, product2) -> product1.price > product2.price ? 1 : -1)
				.get();
		System.out.println(productA.price);
		// min() method to get min Product price
		ProductA productB = productsList.stream().min((product1, product2) -> product1.price > product2.price ? 1 : -1)
				.get();
		System.out.println(productB.price);

	}
}
