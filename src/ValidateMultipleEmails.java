package com.regex;

import java.util.*;

import java.util.regex.Pattern;

import java.util.regex.Matcher;

/**
 * 
 * @author DELL
 *
 */

public class ValidateMultipleEmails {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		String[] emails = { "abc@yahoo.com", "abc-100@yahoo.com", "abc.100@yahoo.com", "abc111@abc.com",
				"abc-100@abc.net", "abc.100@abc.com.au", "abc@1.com", "abc@gmail.com.com", "abc+100@gmail.com" };

		for (String email : emails) {
			if (isValidEmail(email)) {
				System.out.println(email + " is a valid email");
			} else {
				System.out.println(email + " is an invalid email");
			}
		}
	}

	/**
	 * 
	 * @param email
	 * @return
	 */

	public static boolean isValidEmail(String email) {
		// Regular expression pattern for email validation
		String regex = "[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]";

		// Create a pattern object
		Pattern pattern = Pattern.compile(regex);

		// Create a matcher object
		Matcher matcher = pattern.matcher(email);

		// Return true if the email matches the pattern
		return matcher.matches();
	}
}
