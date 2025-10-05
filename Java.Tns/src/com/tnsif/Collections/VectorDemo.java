package com.tnsif.Collections;

import java.util.Vector;

public class VectorDemo {
    public static class NameVector {
        private Vector<String> names;

        public NameVector() {
            names = new Vector<>();
        }

        public void addNames() {
            names.add("Tejas");
            names.add("Ravi");
            names.add("Anu");
            names.add("Meena");
        }

        public void displayNames() {
            System.out.println("Names in Vector: " + names);
        }

        public void removeName() {
            names.remove("Anu");
            System.out.println("After removing Anu: " + names);
        }

        public void getSize() {
            System.out.println("Vector size: " + names.size());
        }

        public void checkContains() {
            System.out.println("Contains Ravi? " + names.contains("Ravi"));
        }
    }
}

