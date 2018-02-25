package com.apex.assignments;

//Problem 6. Define a array with 10 integers and print all the 
//			 elements with its index number.

public class ArrayIndex {

	public static void main(String[] args) {
		int array[] = {2,6,3,8,9,21,23,54,32,65};
		for(int i=0; i < array.length; i++) {
			System.out.print(i+"=>"+array[i]+",");
		}

	}

}
