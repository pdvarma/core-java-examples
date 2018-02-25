package com.apex.assignments;

import java.util.Scanner;

public class Fibonacci {
	static int fib(int n) {
		if (n <= 1) {
			return n;
		}
		return fib(n - 1) + fib(n - 2);
	}

public static void main(String[] args) {
	System.out.print("Enter a number: ");
	Scanner input = new Scanner(System.in);
	int num = input.nextInt();
	System.out.println(fib(num));
	
	
}

}
