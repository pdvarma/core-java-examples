package com.apex.assignments;

import java.util.Scanner;

public class WhichString {

	public static Boolean IsInteger(String str) {
		try {
			Integer.parseInt(str);
			System.out.println("String is integer");
			return true;
		} catch (NumberFormatException e) {
			System.out.println("String is not a integer");
			return false;
		}
	}

	public static Boolean IsOddNumber(String str) {
		if (Integer.parseInt(str) % 2 == 0) {
			System.out.println("String is not odd number");
			return true;
		} else {
			System.out.println("String is odd number");
			return false;
		}
	}

	public static Boolean IsEvenNumber(String str) {
		if (Integer.parseInt(str) % 2 == 0) {
			System.out.println("String even number");
			return true;
		} else {
			System.out.println("String is not a even number");
			return false;
		}
	}

	public static Boolean IsPrimeNumber(String str) {
		int m = Integer.parseInt(str) / 2;
		int flag = 0;
		if (Integer.parseInt(str) == 0 || Integer.parseInt(str) == 0) {
			System.out.println("String is not prime");
		} else {
			for (int i = 2; i <= m; i++) {
				if (Integer.parseInt(str) % i == 0) {
					System.out.println("String is not prime");
					flag = 1;
					return false;
					// break;
				}
			}
			if (flag == 0) {
				System.out.println("String is prime");
				return true;
			}
		}
		return null;

	}

	public static void main(String[] args) {
		System.out.println("Enter a String: ");
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		System.out.println("Entered String: " + str);
		IsInteger(str);
		IsOddNumber(str);
		IsEvenNumber(str);
		IsPrimeNumber(str);
		

	}

}
