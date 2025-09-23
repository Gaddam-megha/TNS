package com.tnsif.inheritance;

public class MultilevelInheritance {

	public static void main(String[] args) {
		Child ob = new Child();  // object of Child

        ob.showChild();   // Child class method
        ob.showParent();  // Parent class method
        ob.showGP();      // GrandParent class method

        System.out.println("Child value = " + ob.cValue);
        System.out.println("Parent value = " + ob.pValue);
        System.out.println("GrandParent value = " + ob.gpValue);
    }

	}


