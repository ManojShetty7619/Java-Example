package com.java8featuresExample;

interface Phone {
	void call();// Abstract method declaring

	default void message() {// we can define the method in java 8. but need to make default method
System.out.println("Sent");
	}

}

class AndPhone implements Phone {
	public void call() {
		System.out.println("Calling");
	}
}

public class MethodInInterface {
	public static void main(String[] args) {
		Phone p = new AndPhone();//create instance of interface
		p.call();
		p.message();
	}
}
