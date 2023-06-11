package com.oops;

public class MethodOverridingExample {
	// 1) same method name 2) different class 3} same arguments(number,type,sequence
	// of arguments)
	void show(int a, int b) {
		System.out.println("method1---Show");
	}
}

class ChildClassX extends MethodOverloadingExample {// need to make IS-A relationship
	// need to add extends key word to make overriding
	void show(int a, int b) {
		System.out.println("method2---Show");
	}

	public static void main(String[] args) {
		MethodOverridingExample overriding = new MethodOverridingExample();
		overriding.show(1, 2);
		System.out.println("---------------");
		ChildClassX classX = new ChildClassX();
		classX.show(2, 3);
		classX.show(3, 4);
	}

}
