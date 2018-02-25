package com.apex.assignments;

//Problem 8. Read the contents of text file and count how many times letter "a" is available

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class TextFile {

	public static void main(String[] args) throws IOException {

		int count = 0;

		BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Dheeraj Varma\\Desktop\\test.txt"));
		String line = reader.readLine();
		System.out.println(line);
		for (int i = 0; i < line.length(); i++) {
			char c = line.charAt(i);
			if (c == 'a')
				count++;
		}
		System.out.println("Occurance of letter 'a' : "+count);
	}

}
