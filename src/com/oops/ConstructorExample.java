package com.oops;

public class ConstructorExample {
	String name;
	int emp_Id;

	public ConstructorExample(String name, int emp_Id) {// parameterized constructor
		// we can initialize object through constructor
		this.name = name;
		this.emp_Id = emp_Id;

	}

	public static void main(String[] args) {
		// ConstructorExample constructor1 = new ConstructorExample();// no argument
		// constructor, takes default values
		// ConstructorExample constructor2 = new ConstructorExample();
		ConstructorExample constructor1 = new ConstructorExample("abc", 111);// initialize values
		ConstructorExample constructor2 = new ConstructorExample("xyz", 112);
		System.out.println("Employee : " + constructor1.name + " , " + constructor1.emp_Id);
		System.out.println("Employee : " + constructor2.name + " , " + constructor2.emp_Id);
	}
}
