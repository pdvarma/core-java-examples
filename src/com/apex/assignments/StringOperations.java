package com.apex.assignments;
import java.lang.StringBuilder;

public class StringOperations {

// Problem 9.Define a String buffer and append all alphabets and display the final string. 
//			 And, do the same exercise using StringBuilder.
	
	public static void main(String[] args) {
		//Appending Alphabets Using String Builder
		StringBuilder str = new StringBuilder();
		char alphabet;
		System.out.print("Using String Builder: ");
		for (alphabet = 'A'; alphabet <= 'Z'; alphabet++ ) {
			str.append(alphabet);
			System.out.print(alphabet);
			
		}
		System.out.println();
		
		//Appending Alphabets Using String Buffer
		StringBuffer string = new StringBuffer();        // When I named the class StingBuffer append method was not working?
		char a;	
		System.out.print("Using String Buffer: ");
		for (a = 'A'; a <= 'Z'; a++ ) {
			str.append(a);
			System.out.print(a);
			
		}
			
		
	}

}
