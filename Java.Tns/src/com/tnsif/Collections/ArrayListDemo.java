package com.tnsif.Collections;

import java.util.ArrayList;  // import Java's ArrayList class

public class ArrayListDemo {
    public static class FruitsList {
        private ArrayList<String> fruits;

        // --- Constructor ---
        public FruitsList() {
            fruits = new ArrayList<>();
        }

        // --- Add elements ---
        public void addFruits() {
            fruits.add("Apple");
            fruits.add("Banana");
            fruits.add("Mango");
            fruits.add("Grapes");
        }

        // --- Display the list ---
        public void displayFruits() {
            System.out.println("Fruits List: " + fruits);
        }

        // --- Access elements ---
        public void displayFirstFruit() {
            System.out.println("First fruit: " + fruits.get(0));
        }

        // --- Update element ---
        public void updateFruit() {
            fruits.set(1, "Orange");
            System.out.println("After updating Banana to Orange: " + fruits);
        }

        // --- Remove element ---
        public void removeFruit() {
            fruits.remove("Mango");
            System.out.println("After removing Mango: " + fruits);
        }

        // --- Check size and contents ---
        public void showDetails() {
            System.out.println("Total fruits: " + fruits.size());
            System.out.println("Contains Apple? " + fruits.contains("Apple"));
        }

        // --- Iterate using for-each loop ---
        public void iterateFruits() {
            System.out.println("\nIterating using for-each loop:");
            for (String fruit : fruits) {
                System.out.println(fruit);
            }
        }
    }
}
