package com.oops;

//Abstraction can achieved by abstract class and interface
abstract class AbstractionExample {// class name followed by abstract

	abstract void start();// abstract method does not have body

}

class Car extends AbstractionExample {

	void start() {// if we extends abstract class, then abstract method body should be in child
					// class. abstract class object can not be created
		System.out.println("car start with key");

	}

}

class Scooter extends AbstractionExample {
	void start() {
		System.out.println("Scooter start with kick");
	}

	public static void main(String[] args) {
		Car c = new Car();// we can create child class object
		c.start();
		Scooter s = new Scooter();
		s.start();
	}
}
