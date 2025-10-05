package com.tnsif.Collections;

import java.util.LinkedList;

public class LinkedListDemo {
    public static class NumberList {
        private LinkedList<Integer> numbers;

        public NumberList() {
            numbers = new LinkedList<>();
        }

        public void addNumbers() {
            numbers.add(10);
            numbers.add(20);
            numbers.add(30);
            numbers.addFirst(5);
            numbers.addLast(40);
        }

        public void displayList() {
            System.out.println("Numbers in LinkedList: " + numbers);
        }

        public void removeNumber() {
            numbers.removeFirst();
            numbers.removeLast();
            System.out.println("After removing first & last: " + numbers);
        }

        public void getElement() {
            System.out.println("Element at index 1: " + numbers.get(1));
        }
    }
}
