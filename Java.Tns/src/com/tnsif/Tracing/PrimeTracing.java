package com.tnsif.Tracing;

public class PrimeTracing {
	public void tracePrime(int num) {

		System.out.println("Tracing Prime Number Logic for: " + num);

		if (num <= 1) {
			System.out.println(num + " is NOT a Prime number (numbers <= 1 are not prime).");
			return;
		}

		boolean isPrime = true;

		for (int i = 2; i <= num / 2; i++) {
			System.out.println("Checking divisibility by: " + i);

			if (num % i == 0) {
				System.out.println(num + " is divisible by " + i);
				isPrime = false;
				break;
			} else {
				System.out.println(num + " is NOT divisible by " + i);
			}
		}

		System.out.println("--------------------");

		if (isPrime)
			System.out.println(num + " is a Prime number!");
		else
			System.out.println(num + " is NOT a Prime number!");
	}
}


