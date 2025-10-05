package com.tnsif.Exception_handling;

public class NestedTry {
	public void show() {
		try {
			System.out.println("Outer try block starts...");

			int a = 10, b = 2;
			int result = a / b;
			System.out.println("Outer division result: " + result);

			try {
				System.out.println("Inner try block starts...");
				int[] arr = new int[3];
				arr[0] = 1;
				arr[1] = 2;
				arr[2] = 3;

				// Accessing invalid index → ArrayIndexOutOfBoundsException
				System.out.println(arr[5]);
			} 
			catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Inner catch block: " + e);
			}

			System.out.println("Outer try block continues after inner try...");
		} 
		catch (ArithmeticException e) {
			System.out.println("Outer catch block: " + e);
		}

		System.out.println("Program continues after nested try-catch...");
	}
}


