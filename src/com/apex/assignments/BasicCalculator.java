package com.apex.assignments;

//Problem 3 : Basic Calculator


import java.util.Scanner;

public class BasicCalculator {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number 1 : ");
		int num1 = input.nextInt();
		System.out.print("Enter number 2 : ");
		int num2 = input.nextInt();
		System.out.println("1.Add 2.Multiply 3.Subtract 4.Divide");
		System.out.print("Select your operation:");
		int choice = input.nextInt();
		switch (choice) {
		case 1:
			System.out.println("Addition: " + (num1 + num2));
			break;

		case 2:
			System.out.println("Multiplication: " + (num1 * num2));
			break;

		case 3:
			System.out.println("Subtraction: " + (double) (num1 - num2));
			break;

		case 4:
			System.out.println("Division: " + (num1 / num2));
			break;

		}

	}

}
