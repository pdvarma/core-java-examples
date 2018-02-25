package com.apex.main;

import java.util.Scanner;

public class Strings {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a String: " );
		String string1 = input.next();

		// String Operations
		System.out.println("Entered String: " + string1);
		System.out.println(string1.charAt(1)); // charAt()
		System.out.println(string1.length()); // length()
		String string2 = " Programming ";
		System.out.println(string1.concat(string2)); // concat()
		System.out.println(string2.replace('j', 'n')); // replace()
		System.out.println(string2.substring(3, 10)); // substring()
		System.out.println(string2.toLowerCase()); // toLowerCase()
		System.out.println(string2.toUpperCase()); // toUpperCase()
		System.out.println(string2.trim()); // trim()
		System.out.println(string2.toCharArray()); // toCharArray()
		System.out.println(string2.contains("mming"));
		System.out.println(string2.replace(" ", "%20")); // Replace spaces with %20

		// String Buffer
		StringBuffer string3 = new StringBuffer("/html");
		StringBuffer string4 = new StringBuffer();
		System.out.println(string4.capacity()); // capacity()
		System.out.println(string3);
		System.out.println(string3.append("/css")); // append()
		System.out.println(string3.insert(0, "/javascript")); // insert()
		System.out.println(string3.replace(0, 1, "Build web sites using:")); // replace()
		System.out.println(string3.delete(0, 22)); // delete()
		System.out.println(string3.reverse()); // reverse()
		System.out.println("Capacity: " + string3.capacity() + " Length: " + string3.length());

	}

}
