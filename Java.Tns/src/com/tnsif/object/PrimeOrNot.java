package com.tnsif.object;
import java.util.Scanner;

public class PrimeOrNot {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        sc.close();

        boolean prime = num > 1;
        for (int i = 2; i * i <= num && prime; i++) {
            if (num % i == 0) prime = false;
        }

        System.out.println(num + (prime ? " is Prime" : " is NOT Prime"));
    }
	

}
