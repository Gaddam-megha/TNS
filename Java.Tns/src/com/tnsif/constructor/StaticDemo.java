package com.tnsif.constructor;

public class StaticDemo {
	static int count;

    // static block (runs once when class is loaded)
    static {
        count = 10;
        System.out.println("Static block executed, count = " + count);
    }

    // static method
    public static void show() {
        System.out.println("Static method called, count = " + count);
    }

}
