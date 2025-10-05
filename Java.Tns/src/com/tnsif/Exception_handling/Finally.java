package com.tnsif.Exception_handling;

public class Finally {
	public void show() {
		try {
			int a = 10, b = 0;
			int result = a / b; // This will cause ArithmeticException
			System.out.println("Result: " + result);
		} 
		catch (ArithmeticException e) {
			System.out.println("Exception caught: " + e);
		} 
		finally {
			System.out.println("This is the finally block — it always executes!");
		}

		System.out.println("Program continues after try-catch-finally...");
	}

}
