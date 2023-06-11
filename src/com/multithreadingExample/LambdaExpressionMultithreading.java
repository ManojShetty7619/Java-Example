package com.multithreadingExample;

//thread is a unit of a process

//class HiB implements Runnable {//we can remove the class

//class HellowB implements Runnable {

public class LambdaExpressionMultithreading {
	public static void main(String[] args) throws Exception {// main is a thread by default
		// Runnable obj1 = new HiB();// create object of runnable , because hiB class is
		// also a runnable
		// Runnable obj1 = new Runnable() {// object of interface with anonymous class

		// public void run() {
		/*
		 * Runnable obj1 = () -> { // use the lambda expression to reduce the code for
		 * (int i = 0; i <= 5; i++) { System.out.println("Hi"); try {
		 * Thread.sleep(1000); } catch (Exception e) { } }
		 * 
		 * };
		 */
		/*
		 * Runnable obj2 = () -> { for (int i = 0; i <= 5; i++) {
		 * System.out.println("Hello"); try { Thread.sleep(1000); } catch (Exception e)
		 * { } }
		 * 
		 * };
		 */

		// Thread t1 = new Thread();// create a thread object to call object
		Thread t1 = new Thread(() -> { // use the lambda expression to reduce the code
			for (int i = 0; i <= 5; i++) {
				System.out.println("Hi");
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
				}
			}

		});// pass object of our class to call the method
			// Thread t2 = new Thread(obj2);
		Thread t2 = new Thread(() -> {// replace obj1 and obj2 with runnable object
			for (int i = 0; i <= 5; i++) {
				System.out.println("Hello");
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
				}
			}

		}, "Hellow thread");// here also we can set the name through runnable

		t1.start();// we can call start method using thread object. but here it calls method of run
					// of runnable class

		try {
			Thread.sleep(60);// sleep method is used for hold for some time
		} catch (Exception e) {
		}
		// obj2.start();// automatically calls run method when we start the thread
		// obj1.show();// call method
		// obj2.show();

		t1.setName("Hi thread");// set name for the thread
		// t2.setName("Hallow Thread");

		System.out.println("thread1 prority:" + t1.getPriority());// check the priority
		// t2.setPriority(10);// set the priority also
		t2.setPriority(Thread.MAX_PRIORITY);// we can use inbuilt constant
		System.out.println("thread2 prority:" + t2.getPriority());

		System.out.println(t1.getName());// Check the thread name
		System.out.println(t2.getName());
		t2.start();
		// obj1.start();// Runnable does not have start method
		t1.join();// join is a method to join the thread(means let wait for the thread to complete
		t2.join();
		// after the thread complete say bye
		System.out.println("Bye");
		System.out.println(t1.isAlive());// check for thread is running or not
	}

}
