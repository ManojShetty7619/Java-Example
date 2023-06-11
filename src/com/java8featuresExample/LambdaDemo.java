package com.java8featuresExample;

interface A {
	void show(int i);// lets add parameter
}

//class XYZ implements A {// the whole purpose of the class is implement A and using only once
//	public void show() {
//		System.out.println("Hello");
//	}
//}

public class LambdaDemo {
	public static void main(String[] args) {
		A obj;// to instantiate interface A we can create a reference of interface,
//		obj = new XYZ();// we can have reference of interface and object of class
//		obj = new A() {// anonymous object
//			// need to provide the implementation to remove the error
//			public void show() {
//				System.out.println("Hello");
//			}
//
//		};
//
//	we have created inner class/anonymous class. but this occupies extra memory
//		// to overcome this we can apply lambda expression
//		obj = () -> System.out.println("Hello"); // this is the lambda expression
//		obj = (int i) -> System.out.println("Hello"); // pass the parameter
		obj = i -> System.out.println("Hello :" + i);// we can remove bracket if we have parameter
		obj.show(10);
		
		A obj2= j-> System.out.println("Hi--"+j);
		obj2.show(100);
	}
}
