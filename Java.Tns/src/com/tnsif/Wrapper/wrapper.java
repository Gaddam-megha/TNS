package com.tnsif.Wrapper;

public class wrapper {
	public void integerExamples() {
        System.out.println("=== Integer Wrapper Examples ===");

        // Example 1: Primitive to Object (Boxing)
        int a = 10;
        Integer obj1 = Integer.valueOf(a);
        System.out.println("Boxing: " + obj1);

        // Example 2: Object to Primitive (Unboxing)
        int b = obj1.intValue();
        System.out.println("Unboxing: " + b);

        // Example 3: Autoboxing & Auto-unboxing
        Integer obj2 = 25;  // Autoboxing
        int c = obj2;       // Auto-unboxing
        System.out.println("Autoboxing & Auto-unboxing: " + c);
    }

    public void doubleExamples() {
        System.out.println("\n=== Double Wrapper Examples ===");

        // Example 1: Primitive to Object (Boxing)
        double x = 15.75;
        Double obj1 = Double.valueOf(x);
        System.out.println("Boxing: " + obj1);

        // Example 2: Object to Primitive (Unboxing)
        double y = obj1.doubleValue();
        System.out.println("Unboxing: " + y);

        // Example 3: Autoboxing & Auto-unboxing
        Double obj2 = 42.9;   // Autoboxing
        double z = obj2;      // Auto-unboxing
        System.out.println("Autoboxing & Auto-unboxing: " + z);
    }

    public void booleanExamples() {
        System.out.println("\n=== Boolean Wrapper Examples ===");

        // Example 1: Primitive to Object (Boxing)
        boolean flag = true;
        Boolean obj1 = Boolean.valueOf(flag);
        System.out.println("Boxing: " + obj1);

        // Example 2: Object to Primitive (Unboxing)
        boolean flag2 = obj1.booleanValue();
        System.out.println("Unboxing: " + flag2);

        // Example 3: Autoboxing & Auto-unboxing
        Boolean obj2 = false;  // Autoboxing
        boolean flag3 = obj2;  // Auto-unboxing
        System.out.println("Autoboxing & Auto-unboxing: " + flag3);
    }
}


