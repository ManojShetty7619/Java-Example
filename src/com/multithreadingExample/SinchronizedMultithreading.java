package com.multithreadingExample;

class Counter {
	int count;

	public synchronized void increment() {

		count++;
	}
}

public class SinchronizedMultithreading {
	public static void main(String[] args) throws Exception {
		Counter c = new Counter();
		// c.increment();
		Thread thread1 = new Thread(new Runnable() {

			public void run() {
				for (int i = 1; i <= 1000; i++) {
					c.increment();
				}

			}
		});

		Thread thread2 = new Thread(new Runnable() {

			public void run() {
				for (int i = 1; i <= 1000; i++) {
					c.increment();
				}

			}
		});
		thread1.start();
		thread1.join();
		thread2.start();
		thread2.join();
		System.out.println("Count--" + c.count);

	}
}
