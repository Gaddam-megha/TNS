package com.tnsif.threading;

public class MainJoinAndWait {
	public static void main(String[] args) {

		// Demonstrate join()
		System.out.println("=== Demonstrating join() ===");
		JoinAndWaitDemo t1 = new JoinAndWaitDemo();
		JoinAndWaitDemo t2 = new JoinAndWaitDemo();

		t1.setName("Thread-A");
		t2.setName("Thread-B");

		t1.start();

		try {
			t1.join(); // Main waits for t1 to finish before starting t2
		} catch (InterruptedException e) {
			System.out.println(e);
		}

		t2.start();

		try {
			t2.join(); // Main waits for t2 to finish
		} catch (InterruptedException e) {
			System.out.println(e);
		}

		System.out.println("Main thread finished after join() demonstration.\n");

		// Demonstrate wait()
		System.out.println("=== Demonstrating wait() ===");
		SharedData shared = new SharedData();

		Thread waitingThread = new Thread(() -> shared.waitingTask(), "Waiting-Thread");
		Thread notifierThread = new Thread(() -> {
			try {
				Thread.sleep(1000); // ensure waiting thread runs first
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			shared.notifyTask();
		}, "Notifier-Thread");

		waitingThread.start();
		notifierThread.start();
	}
}


