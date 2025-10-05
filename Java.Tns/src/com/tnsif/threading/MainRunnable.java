package com.tnsif.threading;

public class MainRunnable {
    public static void main(String[] args) {
        MyRunnable r = new MyRunnable();

        Thread t1 = new Thread(r, "Thread-A");
        Thread t2 = new Thread(r, "Thread-B");

        t1.start();
        t2.start();

        System.out.println("Main thread ends here...");
    }
}
