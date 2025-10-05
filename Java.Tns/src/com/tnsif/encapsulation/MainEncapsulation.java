package com.tnsif.encapsulation;

public class MainEncapsulation {
    public static void main(String[] args) {

        // Create instance of outer class
        Encapsulation outer = new Encapsulation();

        // Create instance of inner class using outer object
        Encapsulation.Car car1 = outer.new Car("Red", "Civic", 5);
        Encapsulation.Car car2 = outer.new Car("Blue", "Swift", 4);

        // Display details and behavior
        System.out.println(car1);
        car1.start();
        car1.drift();
        car1.stop();

        System.out.println(car2);
        car2.start();
        car2.stop();
    }
}



