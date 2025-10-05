package com.tnsif.Collections;

public class MainHashSet {
    public static void main(String[] args) {
        HashSetDemo.CitySet set = new HashSetDemo.CitySet();

        set.addCities();
        set.displayCities();
        set.removeCity();
        set.checkCity();
    }
}
