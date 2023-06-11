package com.oops;

public class ObjectMethodExample { // access modifier class and ClassName

	String colour;
	String animalType;
	int animalAge;

	public void eat() { // access modifier return type methodName(list of parameter)
		System.out.println("Eating");
	}

	public void run() {
		System.out.println("running");
	}

	public static void main(String[] args) { // class should contain main method
		System.out.println("1------>");
		ObjectMethodExample dog = new ObjectMethodExample(); // create object to call the method
		// ClassName object name = new(create object using new key word)3 ClassName ()
		// (Constructor)
		dog.eat(); // call the method through object
		dog.run();
		Birds sp = new Birds();// create a object for fly method. can not call another class
		// method with same class
		sp.fly();
		ObjectMethodExample animal = new ObjectMethodExample();// initialize object by reference variable
		animal.animalType = "dog"; // initialize by dot operator
		animal.colour = "black";
		animal.animalAge = 10;
		System.out.println("animal type :" + animal.animalType + " , " + "animal colour :" + animal.colour + " , "
				+ "animal age :" + animal.animalAge);
		ObjectMethodExample animal2 = new ObjectMethodExample();// create a object to initialize method
		animal2.initializeObj("cat", "white", 4);// initialize data to method
		animal2.display();// call display method to print the data

	}

	void initializeObj(String a, String b, int c) {// initialize object through method and pass parameter
		animalType = a;// initialize variable to data types
		colour = b;
		animalAge = c;
	}

	void display() { // create a method to display (print data)
		System.out.println(
				"animal type :" + animalType + " , " + "animal colour :" + colour + " , " + "animal age :" + animalAge);
	}

}

class Birds { // create an another class
	public void fly() { // create a method, this method call directly. called from main method
		System.out.println("flying");
	}
}
