package com.tnsif.StringOperations;

public class StringOperations {

	    public void performStringOperations() {
	        System.out.println("=== String Operations ===");

	        String str = "Hello";
	        System.out.println("Original String: " + str);

	        // Concatenation (creates new object)
	        str = str.concat(" World");
	        System.out.println("After Concatenation: " + str);

	        // Substring
	        System.out.println("Substring (2 to 5): " + str.substring(2, 5));

	        // Uppercase & Lowercase
	        System.out.println("Uppercase: " + str.toUpperCase());
	        System.out.println("Lowercase: " + str.toLowerCase());
	    }

	    public void performStringBufferOperations() {
	        System.out.println("\n=== StringBuffer Operations ===");

	        StringBuffer sb = new StringBuffer("Java");
	        System.out.println("Original StringBuffer: " + sb);

	        // Append
	        sb.append(" Programming");
	        System.out.println("After Append: " + sb);

	        // Insert
	        sb.insert(4, " Language");
	        System.out.println("After Insert: " + sb);

	        // Reverse
	        sb.reverse();
	        System.out.println("After Reverse: " + sb);
	    }

	    public void performStringBuilderOperations() {
	        System.out.println("\n=== StringBuilder Operations ===");

	        StringBuilder sb = new StringBuilder("Python");
	        System.out.println("Original StringBuilder: " + sb);

	        // Append
	        sb.append(" Language");
	        System.out.println("After Append: " + sb);

	        // Replace
	        sb.replace(0, 6, "C++");
	        System.out.println("After Replace: " + sb);

	        // Delete
	        sb.delete(3, 12);
	        System.out.println("After Delete: " + sb);

	        // Reverse
	        sb.reverse();
	        System.out.println("After Reverse: " + sb);
	    }
	}



