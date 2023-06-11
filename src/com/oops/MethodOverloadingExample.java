package com.oops;

import java.security.PublicKey;

//Polymorphism - many forms
// two types- 1) Compile time polymorphism/static polymorphism --Method Overloading
//2) Run time polymorphism/dynamic polymorphism --Method Overriding
//method overloading can't achieved by changing the return type method
// main method can be overloaded. but need to create a object

public class MethodOverloadingExample {
	public int i = 10;

	// 1) same method name 2) same class 3} different arguments(number,type,sequence
	// of arguments)
	void show(int a, int b) {
		System.out.println("method1");
	}

	void show(int a, String b) {
		System.out.println("method2");
	}

	public static void main(String[] args) {
//		EncapsulationExample en = new EncapsulationExample();

		MethodOverloadingExample overloading = new MethodOverloadingExample();

		overloading.show('a', 'b');// automatic promotion
		overloading.show(10, "abc");
	}
}
