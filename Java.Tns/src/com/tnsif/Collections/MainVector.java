package com.tnsif.Collections;

public class MainVector {
    public static void main(String[] args) {
        VectorDemo.NameVector v = new VectorDemo.NameVector();

        v.addNames();
        v.displayNames();
        v.removeName();
        v.getSize();
        v.checkContains();
    }
}
