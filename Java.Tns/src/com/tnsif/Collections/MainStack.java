package com.tnsif.Collections;

public class MainStack {
    public static void main(String[] args) {
        StackDemo.NumberStack s = new StackDemo.NumberStack();

        s.pushElements();
        s.displayStack();
        s.peekElement();
        s.popElement();
        s.checkEmpty();
    }
}

