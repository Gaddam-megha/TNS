package com.tnsif.constructor;

public class overloading {
	// Method overloading with different parameter types
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    // Method overloading with different parameter sequence
    double add(int a, double b) {
        return a + b;
    }

    double add(double a, int b) {
        return a + b;
    }
}


