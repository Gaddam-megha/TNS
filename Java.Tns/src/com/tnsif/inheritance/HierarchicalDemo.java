package com.tnsif.inheritance;

public class HierarchicalDemo {

	public static void main(String[] args) {
		HierChild1 c1 = new HierChild1();
        c1.showParent();
        c1.showChild1();

        HierChild2 c2 = new HierChild2();
        c2.showParent();
        c2.showChild2();
    }

	}

