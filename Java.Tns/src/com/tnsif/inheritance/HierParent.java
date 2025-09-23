package com.tnsif.inheritance;

public class HierParent {
	public void showParent() {
        System.out.println("This is HierParent class");
    }
}

// Child1
class HierChild1 extends HierParent {
    public void showChild1() {
        System.out.println("This is HierChild1 (extends HierParent)");
    }
}

// Child2
class HierChild2 extends HierParent {
    public void showChild2() {
        System.out.println("This is HierChild2 (extends HierParent)");
    }

}
