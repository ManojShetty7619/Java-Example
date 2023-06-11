package com.java8featuresExample.streamExample;

import java.util.ArrayList;
import java.util.List;

class Items {
	int item_Id;
	String item_Name;
	float item_Price;

	public Items(int item_Id, String item_Name, float item_Price) {
		this.item_Id = item_Id;
		this.item_Name = item_Name;
		this.item_Price = item_Price;

	}

}

public class StreamFilterAndIterator {
	public static void main(String[] args) {
		List<Items> itemList = new ArrayList<>();
		itemList.add(new Items(111, "Mobile Phone", 15000));
		itemList.add(new Items(111, "Laptop", 15000));
		itemList.add(new Items(111, "TV", 30000));
		itemList.add(new Items(111, "Ipad", 45000));
		itemList.add(new Items(111, "AC", 55000));
//		itemList.stream().filter(item -> item.item_Price == 15000)// filter the data
//				.forEach(item // iterate using for each
//				-> System.out.println(item.item_Name));
		itemList.stream().filter(item -> item.item_Price == 15000).forEach(item -> System.out.println(item.item_Name));

	}

}
