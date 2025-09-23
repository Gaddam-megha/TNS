package com.tnsif.inheritance;
class SuperParent {
    // Parent constructor
    SuperParent() {
        System.out.println("Parent constructor called");
    }

    // Parent method
    public void display() {
        System.out.println("This is Parent class method");
    }
}

// Child class
class SuperChild extends SuperParent {
    // Child constructor
    SuperChild() {
        super(); // 👈 Calls Parent constructor
        System.out.println("Child constructor called");
    }

    @Override
    public void display() {
        System.out.println("This is Child class method");
        super.display(); // 👈 Calls Parent method
    }
}


public class SuperKeyword {
	public static void main(String[] args) {
        SuperChild obj = new SuperChild(); // constructor chain
        obj.display();                     // method + super method
    }

}
