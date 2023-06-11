package com.oops;

// interface are similar to abstract class but having all methods of abstract type
// all methods are public abstract 
//all fields are public static final
// it can have default concrete method, but should declare default from version 8
// static methods can be created, default it takes public as access modifier
//private methods can created.from version 9
//interface object can not create

interface InterfaceExample {
	void show();

}

class ExampleA implements InterfaceExample {

	public void show() {
		System.out.println("print example1");
	}

	public static void main(String[] args) {
		ExampleA exampple1 = new ExampleA();
		exampple1.show();
	}

}
