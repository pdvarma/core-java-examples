package com.apex.assignments;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;

public class Dates {

	public static void main(String[] args) throws java.text.ParseException {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a Date in (yyyy-mm-dd): ");
		String str = input.next();
		SimpleDateFormat format = new SimpleDateFormat("yyyy-mm-dd");
		Date date = null;
		try {
			date = format.parse(str);			
		}catch (ParseException e) {
		    e.printStackTrace();
		}
		//System.out.println(date);
		SimpleDateFormat format2 = new SimpleDateFormat("mm/dd/yy");
		String DateToStr = format2.format(date);
		System.out.println(DateToStr);
		SimpleDateFormat format3 = new SimpleDateFormat("dd/mm/yy");
		DateToStr = format3.format(date);
		System.out.println(DateToStr);
		SimpleDateFormat format4 = new SimpleDateFormat("E, dd MMM yyyy HH:mm:ss z");
		DateToStr = format4.format(date);
		System.out.println(DateToStr);
		
		
		
		
		
		

	}

	}


