package com.tnsif.constructor;

public class Testoverriding extends overriding {
	Testoverriding() {
        super(); // calls parent constructor
        System.out.println("Child class constructor");
    }

    public static void main(String[] args) {
        Testoverriding obj = new Testoverriding(); // object creation
    }

}
