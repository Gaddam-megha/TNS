package com.tnsif.inheritance;

public class SingleInheritance {
	    public static void main(String[] args) {
	        SingleChild ob = new SingleChild();
	        ob.display();            // child method
	        System.out.println(ob.a); // inherited variable
	        ob.show();               // parent method
	    }
	}