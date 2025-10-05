package com.tnsif.Tracing;

public class PalindromeTracing {
	public void tracePalindrome(int num) {

		int original = num;
		int remainder, reversed = 0;

		System.out.println("Tracing Palindrome Number Logic for: " + num);

		while (num != 0) {
			remainder = num % 10;                 // extract last digit
			System.out.println("Extracted Digit: " + remainder);

			reversed = (reversed * 10) + remainder; // build reversed number
			System.out.println("Intermediate Reversed Value: " + reversed);

			num = num / 10;                        // remove last digit
			System.out.println("Remaining Number: " + num);
			System.out.println("--------------------");
		}

		System.out.println("Final Reversed Value: " + reversed);

		if (original == reversed)
			System.out.println(original + " is a Palindrome number!");
		else
			System.out.println(original + " is NOT a Palindrome number!");
	}

}
