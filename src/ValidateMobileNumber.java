package com.regex;

import java.util.*;

import java.util.regex.Pattern;

import java.util.regex.Matcher;

/**
 * 
 * @author DELL
 *
 */

public class ValidateMobileNumber {
	/**
	 * 
	 * @param args
	 */

	    public static void main(String[] args) {
	    	/*
			 * Declaring Scanner Object 
			 * Define regex for the mobile number in the given format
			 * Displaying the result
			 */
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter mobile number");

		String Number = sc.nextLine().trim();

		/*
		 * To define regex for mobile number and matching mobile number with expression given by the user
		 */
		Pattern pattern = Pattern.compile("[1-9]{1}[0-9]{1} [6-9]{1}[0-9]{9}");

		Matcher matcher = pattern.matcher(Number);

		boolean result = matcher.matches();

		if (result) {
			System.out.println("Phone Number entered by the user is valid");
		} else {
			System.out.println("Phone Number entered by the user is invalid");
		}

	}

}
