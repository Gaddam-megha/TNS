package com.tnsif.threading;

public class MyThread extends Thread {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(Thread.currentThread().getName() + " - Count: " + i);
			try {
				Thread.sleep(500); // pause for half a second to observe threading
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
		System.out.println(Thread.currentThread().getName() + " has finished execution.\n");
	}

}
