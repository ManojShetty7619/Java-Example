package com.multithreadingExample;

class Count {
	int count;

	public synchronized void inc() {
		count++;
	}
}

public class A {

	public static void main(String[] args) throws Exception {
		Count count = new Count();
		count.inc();
		Thread tr1 = new Thread(new Runnable() {

			public void run() {
				for (int i = 1; i <= 1000; i++) {
					count.inc();
				}

			}
		});

		Thread tr2 = new Thread(new Runnable() {

			public void run() {
				for (int i = 1; i <= 1000; i++) {
					count.inc();
				}

			}
		});
		Thread tr3 = new Thread(new Runnable() {

			public void run() {
				for (int i = 1; i <= 1000; i++) {
					count.inc();
				}

			}
		});
		tr1.start();
		tr2.start();
		tr1.join();
		tr2.join();
		tr3.start();
		tr3.join();
		System.out.println("Count----:" + count.count);

	}

}
