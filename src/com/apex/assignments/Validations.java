package com.apex.assignments;
import java.util.Scanner;

// Problem 14: Do the validations

public class Validations {

	public static final String UserIdValidator = "^[a-zA-Z.][a-zA-Z0-9\\w.]{5,16}$";
	public static final String FirstNameValidator = "^[a-zA-Z.][a-zA-Z0-9\\w-.]{1,16}$";
	public static final String EmailAddressValidator = "\"^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\\\.[A-Z]{2,51}$\"";
	public static final String HomeAddressValidator = "^[a-zA-Z.][a-zA-Z0-9\\w-.]{0,9}$";
	public static final String dateValidator = "^\\d{4}-\\d{2}-\\d{2}$";

	public static void main(String[] args) {
		System.out.println("Enter User Id: ");
		Scanner scan = new Scanner(System.in);
		String userId = scan.nextLine();
		System.out.println("Enter First Name: ");
		String firstName = scan.nextLine();
		System.out.println("Enter Email Address: ");
		String emailAddress = scan.nextLine();
		System.out.println("Enter Home Address: ");
		String homeAddress = scan.nextLine();
		System.out.println("Enter Date: ");
		String date = scan.nextLine();

		// User Id
		if (userId.matches(Validations.UserIdValidator)) {
			System.out.println("Valid");
		} else {
			if (userId.isEmpty()) { // If no user id is entered
				System.out.println("HRMS_R0001: Please choose a user id for your account");
			} else {
				System.out.println(
						"HRMS_R0002: Used ID must start with a letter. It can contain only letters, numbers, and underscores (_). Please enter a valid User ID.");
				System.out.println(
						"HRMS_R0003: The User ID must be 6 to 15 characters. Please check and enter a valid User ID.");
				System.out.println(
						"HRMS_R0004: The User Id you provided has already been used. Please Choose other User ID.");
			}
		}

		// First Name
		if (firstName.matches(Validations.FirstNameValidator)) {
			System.out.println("Valid");
		} else {
			if (firstName.isEmpty()) { // If nothing is entered
				System.out.println("HRMS_R0009: Please specify First Name.");
			} else {
				System.out.println(
						"HRMS_R0010: First Name must start with a letter. It can contain only letters, numbers, and Spaces, Hyphens (-), Underscores (_). Please enter a valid First Name");
				System.out.println(
						"HRMS_R0011: The First Name is less than 2 characters. Please Check and enter a valid First Name.");
				System.out.println(
						"HRMS_R0004: The User Id you provided has already been used. Please Choose other User ID.");
			}
		}

		// Email
		if (emailAddress.matches(Validations.EmailAddressValidator)) {
			System.out.println("Valid");
		} else {
			if (emailAddress.isEmpty()) { // If nothing is entered
				System.out.println("HRMS_R0016: Please specify Email Address");
			} else {
				System.out.println("HRMS_R0017: Invalid Address. for eg: a@b.com");

			}
		}

		// Home Address
		if (homeAddress.matches(Validations.EmailAddressValidator)) {
			System.out.println("Valid");
		} else {
			if (homeAddress.isEmpty()) { // If nothing is entered
				System.out.println("HRMS_R0016: Please specify Home Address");
			} else {
				System.out.println(
						"HRMS_R0018: City can contain only letters, numbers, and Spaces, Hyphens (-), underscores (_). Please enter a valid City.");

			}
		}

		// Date and Day

		if (date.matches(Validations.dateValidator)) {
			System.out.println("Valid");
		} else {
			if (date.isEmpty()) { // If nothing is entered
				System.out.println("HRMS_R0024: Please specify Day.");
			} else {
				System.out.println("HRMS_R0025: Day contains 1-2 digits. Please enter a valid Day.");

			}
		}

	}

}
