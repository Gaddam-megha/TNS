package com.tnsif.inheritance;

// Base Parent class
public class HybridParent {
    public void showParent() {
        System.out.println("This is HybridParent class");
    }
}

// Child1 (Hierarchical)
class HybridChild1 extends HybridParent {
    public void showChild1() {
        System.out.println("This is HybridChild1 (extends HybridParent)");
    }
}

// Child2 (Hierarchical)
class HybridChild2 extends HybridParent {
    public void showChild2() {
        System.out.println("This is HybridChild2 (extends HybridParent)");
    }
}

// GrandChild (Multilevel through Child1)
class HybridGrandChild extends HybridChild1 {
    public void showGrandChild() {
        System.out.println("This is HybridGrandChild (extends HybridChild1, so also from HybridParent)");
    }
}
