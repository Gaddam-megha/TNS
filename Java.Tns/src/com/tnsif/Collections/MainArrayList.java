package com.tnsif.Collections;

public class MainArrayList {
    public static void main(String[] args) {
        ArrayListDemo.FruitsList list = new ArrayListDemo.FruitsList();

        list.addFruits();
        list.displayFruits();
        list.displayFirstFruit();
        list.updateFruit();
        list.removeFruit();
        list.showDetails();
        list.iterateFruits();
    }
}
