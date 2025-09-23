package com.tnsif.inheritance;

public class MultilevelInh {
	 int gpValue = 100;

	    public void showGP() {
	        System.out.println("This is GrandParent class");
	    }
	}

	// Parent class (inherits GrandParent)
	class Parent extends MultilevelInh {
	    int pValue = 50;

	    public void showParent() {
	        System.out.println("This is Parent class");
	    }
	}

	// Child class (inherits Parent -> also gets GrandParent)
	class Child extends Parent {
	    int cValue = 25;

	    public void showChild() {
	        System.out.println("This is Child class");
	    }
	}


