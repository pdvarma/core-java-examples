package com.apex.assignments;

// Problem : Resource Bundler

import java.util.Locale;
import java.util.logging.Logger;
import java.util.ResourceBundle;

public class Bundler {

	public static void main(String[] args) {
		System.out.println("Current Locale: "+Locale.getDefault());			 // Gives the current locale
		ResourceBundle mybundle = ResourceBundle.getBundle("company");		 // Loads the resource bundle
		System.out.println(mybundle.getString("Company"));
		System.out.println(mybundle.getString("Address"));
		System.out.println(mybundle.getString("Totalnoofemployees"));
		
		


		

	}

	

}

