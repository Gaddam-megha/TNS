package com.tnsif.threading;

class SharedData {
	synchronized void waitingTask() {
		System.out.println(Thread.currentThread().getName() + " is now waiting...");
		try {
			wait();  // Thread releases the lock and waits
		} catch (InterruptedException e) {
			System.out.println(e);
		}
		System.out.println(Thread.currentThread().getName() + " resumed after being notified!");
	}

	synchronized void notifyTask() {
		System.out.println(Thread.currentThread().getName() + " is notifying waiting thread...");
		notify();  // wakes up one waiting thread
	}
}

public class JoinAndWaitDemo extends Thread {
	public void run() {
		for (int i = 1; i <= 3; i++) {
			System.out.println(Thread.currentThread().getName() + " - Count: " + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
		System.out.println(Thread.currentThread().getName() + " finished execution.");
	}
}
