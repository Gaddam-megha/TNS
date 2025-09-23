package com.tnsif.constructor;

public class TestOverloading {
	public static void main(String[] args) {
        overloading obj = new overloading();

        System.out.println("Sum of two integers: " + obj.add(10, 20));
        System.out.println("Sum of two doubles: " + obj.add(5.5, 4.5));
        System.out.println("Sum of (int, double): " + obj.add(10, 3.5));
        System.out.println("Sum of (double, int): " + obj.add(2.5, 15));
    }

}
