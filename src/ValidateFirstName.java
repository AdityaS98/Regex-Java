package com.regex;

import java.util.*;

import java.util.regex.Matcher;

import java.util.regex.Pattern;


/**
 * 
 * @author DELL
 *
 */

public class ValidateFirstName {
	/**
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		/*
		 * Declaring Scanner 
         * Define regex for first name and matching first name with the give expression for the first three letters
		 * Displaying the result
		 */
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter first name");

		String Name = sc.next();

		/*
		 * To define regex for first name and matching first name with the give expression for the first three letters
		 */
		boolean result = Pattern.matches("\\p{Upper}(\\p{Lower}+\\s?){3}", Name);

		if (result) {
			System.out.println("First name enterd by the user is valid");
		} else {
			System.out.println("First name enterd by the user is invalid");
		}
	}

}
