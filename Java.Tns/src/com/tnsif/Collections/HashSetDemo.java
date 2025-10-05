package com.tnsif.Collections;

import java.util.HashSet;

public class HashSetDemo {
    public static class CitySet {
        private HashSet<String> cities;

        public CitySet() {
            cities = new HashSet<>();
        }

        public void addCities() {
            cities.add("Hyderabad");
            cities.add("Chennai");
            cities.add("Bangalore");
            cities.add("Hyderabad"); // duplicate ignored
        }

        public void displayCities() {
            System.out.println("Cities in HashSet: " + cities);
        }

        public void removeCity() {
            cities.remove("Chennai");
            System.out.println("After removing Chennai: " + cities);
        }

        public void checkCity() {
            System.out.println("Contains Hyderabad? " + cities.contains("Hyderabad"));
        }
    }
}
