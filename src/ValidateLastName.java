package com.regex;

import java.util.*;

import java.util.regex.Pattern;

ValidatePassword4.java

/**
 * 
 * @author DELL
 *
 */
public class ValidateLastName {
	/**
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		/*
		 * Declaring Scanner Object
         * Define regex for first name and matching last name with the give expression for the first three letters
		 * Displaying the result
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Last name");

		String Name = sc.next();

		/*
		 * To define regex for last name and matching last name with expression
		 */
		boolean result = Pattern.matches("\\p{Upper}(\\p{Lower}+\\s?){2}", Name);

		if (result) {
			System.out.println("Last name  given by the user is valid");
		} else {
			System.out.println("Last name is given by the user is invalid");
		}
	}

}
