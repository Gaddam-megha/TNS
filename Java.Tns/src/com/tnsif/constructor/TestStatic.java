package com.tnsif.constructor;

public class TestStatic {
	public static void main(String[] args) {
        System.out.println("Main method started");

        // Access static variable
        System.out.println("Initial count = " + StaticDemo.count);

        // Modify static variable
        StaticDemo.count = 50;

        // Call static method
        StaticDemo.show();
    }
}


