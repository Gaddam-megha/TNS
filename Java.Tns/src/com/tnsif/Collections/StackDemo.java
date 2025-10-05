package com.tnsif.Collections;

import java.util.Stack;

public class StackDemo {
    public static class NumberStack {
        private Stack<Integer> stack;

        public NumberStack() {
            stack = new Stack<>();
        }

        public void pushElements() {
            stack.push(10);
            stack.push(20);
            stack.push(30);
            stack.push(40);
        }

        public void displayStack() {
            System.out.println("Stack elements: " + stack);
        }

        public void popElement() {
            System.out.println("Popped element: " + stack.pop());
            System.out.println("Stack after pop: " + stack);
        }

        public void peekElement() {
            System.out.println("Top element: " + stack.peek());
        }

        public void checkEmpty() {
            System.out.println("Is stack empty? " + stack.isEmpty());
        }
    }
}

