package com.multithreadingExample;

//thread is a unit of a process
class HiA implements Runnable {// making class as thread using interface
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

class HellowA implements Runnable {
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

public class RunnableMultithreading {
	public static void main(String[] args) {// main is a thread by default
		HiA obj1 = new HiA();// create object
		HellowA obj2 = new HellowA();

		// Thread t1 = new Thread();// create a thread object to call object
		Thread t1 = new Thread(obj1);// pass object of our class to call the method
		Thread t2 = new Thread(obj2);

		t1.start();// we can call start method using thread object. but here it calls method of run
					// of runnable class

		// obj1.start();// Runnable does not have start method
		try {
			Thread.sleep(50);// sleep method is used for hold for some time
		} catch (Exception e) {
		}
		t2.start();
		// obj2.start();// automatically calls run method when we start the thread
		// obj1.show();// call method
		// obj2.show();
	}

}
