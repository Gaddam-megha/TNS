package com.tnsif.Tracing;

public class ArmstrongTracing {
	public void traceArmstrong(int num) {

		int original = num;
		int remainder, result = 0;

		System.out.println("Tracing Armstrong Number Logic for: " + num);

		while (num != 0) {
			remainder = num % 10;            // get last digit
			System.out.println("Extracted Digit: " + remainder);
			
			result = result + (remainder * remainder * remainder);  // cube and add
			System.out.println("Intermediate Result: " + result);
			
			num = num / 10;                  // remove last digit
			System.out.println("Remaining Number: " + num);
			System.out.println("--------------------");
		}

		System.out.println("Final Computed Value: " + result);

		if (original == result)
			System.out.println(original + " is an Armstrong number!");
		else
			System.out.println(original + " is NOT an Armstrong number!");
	}

}
