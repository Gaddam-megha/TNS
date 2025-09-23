package com.tnsif.inheritance;

public class HybridDemo {
    public static void main(String[] args) {
        HybridChild1 c1 = new HybridChild1();
        c1.showParent();
        c1.showChild1();

        HybridChild2 c2 = new HybridChild2();
        c2.showParent();
        c2.showChild2();

        HybridGrandChild gc = new HybridGrandChild();
        gc.showParent();
        gc.showChild1();
        gc.showGrandChild();
    }
}
