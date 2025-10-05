package com.tnsif.threading;

public class MainThread {
	public static void main(String[] args) {

		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();
		MyThread t3 = new MyThread();

		// Give custom thread names
		t1.setName("Thread-A");
		t2.setName("Thread-B");
		t3.setName("Thread-C");

		// Start all threads
		t1.start();
		t2.start();
		t3.start();

		System.out.println("Main thread ends here...");
	}
}

