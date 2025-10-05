package com.tnsif.Exception_handling;

public class Throw {
	public void checkAge(int age) {
		if (age < 18) {
			// Manually throwing an exception
			throw new ArithmeticException("Access denied - You must be at least 18 years old.");
		} else {
			System.out.println("Access granted - You are old enough!");
		}
	}

}
