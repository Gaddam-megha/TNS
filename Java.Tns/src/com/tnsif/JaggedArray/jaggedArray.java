package com.tnsif.JaggedArray;

public class jaggedArray {
	public void displayJaggedArray() {

        // Creating a jagged array (array of arrays with different sizes)
        int[][] arr = new int[3][];

        // Initializing each row with different column sizes
        arr[0] = new int[] {1, 2, 3};
        arr[1] = new int[] {4, 5};
        arr[2] = new int[] {6, 7, 8, 9};

        // Displaying the jagged array
        System.out.println("Jagged Array elements:");

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(); // new line after each row
        }
    }

}
