package com.apex.assignments;

/*Problem 5 :
	1.Generate 1000 numbers
	2.Generate multiple of 5 and less than 1000
	3.Generate odd numbers up to 1000

*/
public class GenerateNumbers {

	public static void main(String[] args) {
		System.out.println("Generate 1000 numbers:");
		for (int i = 0; i <= 1000; i++) {
			System.out.print(i + ",");
		}
		System.out.println();
		System.out.println("Generate Multiple of 5 and less than 1000:");
		for (int i = 0; i <= 1000; i++) {
			if (i % 5 == 0)
				System.out.print(i + ",");
		}
		System.out.println();
		System.out.println("Generate odd numbers uo to 1000:");
		for (int i = 0; i <= 1000; i++) {
			if (i % 2 != 0)
				System.out.print(i + ",");
		}

	}

}
