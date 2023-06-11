
package com.multithreadingExample;

//thread is a unit of a process
class Hi extends Thread {// making class as thread
	// public void show() {
	public void run() {// need to mention run method
		for (int i = 0; i <= 5; i++) {// print 5 times
			System.out.println("Hi");// print hi
			try {
				Thread.sleep(1000);// sleep method is used for hold for some time
			} catch (Exception e) {
			}
		}
	}
}

class Hellow extends Thread {
	public void run() {
		for (int i = 0; i <= 5; i++) {
			System.out.println("Hello");
			try {
				Thread.sleep(1000);// sleep method is used for hold for some time
			} catch (Exception e) {
			}
		}
	}
}

public class MultithreadingExample {
	public static void main(String[] args) {// main is a thread by default
		Hi obj1 = new Hi();// create object
		Hellow obj2 = new Hellow();
		obj1.start();//  method start belong to thread, thread executes method.
		// delay between two thread
		try {
			Thread.sleep(50);// sleep method is used for hold for some time
		} catch (Exception e) {
		}
		obj2.start();// automatically calls run method when we start the thread
		// obj1.show();// call method
		// obj2.show();
	}

}
