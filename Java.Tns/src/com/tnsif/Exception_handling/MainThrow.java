package com.tnsif.Exception_handling;

public class MainThrow {
	public static void main(String[] args) {

		Throw obj = new Throw();

		try {
			obj.checkAge(15); // This will throw an exception
		} 
		catch (ArithmeticException e) {
			System.out.println("Exception caught: " + e);
		}

		System.out.println("Program continues after throw...");
	}
}


