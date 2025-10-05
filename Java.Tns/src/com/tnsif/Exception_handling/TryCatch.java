package com.tnsif.Exception_handling;

public class TryCatch {
	
		public void divideNumbers() {
			try {
				int a = 10, b = 0;
				int result = a / b; // Division by zero → ArithmeticException
				System.out.println("Result: " + result);
			} 
			catch (Exception e) {
				System.out.println(e);
			}
		}
	}



