package com.tnsif.Exception_handling;

public class MultipleCatch {
	public void show() {
		try {
			int[] arr = new int[3];
			arr[0] = 10;
			arr[1] = 20;
			arr[2] = 30;

			int a = 10, b = 0;

			// This causes ArithmeticException
			int result = a / b;

			// This would cause ArrayIndexOutOfBoundsException (if executed)
			System.out.println(arr[3]);

			System.out.println("Result: " + result);
		} 
		catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception caught: " + e);
		} 
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index Out Of Bounds Exception caught: " + e);
		} 
		catch (Exception e) {
			System.out.println("General Exception caught: " + e);
		}

		System.out.println("Program continues after handling multiple catch blocks...");
	}

}
