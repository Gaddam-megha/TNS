package com.tnsif.Exception_handling;

public class StringIndexOutOfBounds {
	public void display() {
		try {
			String str = "HELLO";
			System.out.println("Character at index 1: " + str.charAt(1));  // valid
			System.out.println("Character at index 10: " + str.charAt(10)); // invalid → exception
		} 
		catch (StringIndexOutOfBoundsException e) {
			System.out.println("Exception caught: " + e);
		}

		System.out.println("Program continues normally after handling exception...");
	}

}
