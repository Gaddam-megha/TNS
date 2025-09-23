package com.tnsif.object;

public interface prime {
	public static void main(String[]args) {
		System.out.println("Prime numbers from 1 to 100 are:");

	    for (int num = 2; num <= 100; num++) {
	        boolean isPrime = true;

	        // Check if num is divisible by any number other than 1 and itself
	        for (int i = 2; i <= num / 2; i++) {
	            if (num % i == 0) {
	                isPrime = false;
	                break;
	            }
	        }

	        if (isPrime) {
	            System.out.print(num + " ");
	        }
	    }
	}

}
