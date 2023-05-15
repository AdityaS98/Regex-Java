package com.regex;

import java.util.*;

import java.util.regex.Pattern;

import java.util.regex.Matcher;
/**
 * 
 * @author DELL
 *
 */

public class ValidatePassword2 {
	/**
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		/*
		 * Declaring Scanner Object
         * Define regex for password and matching password name with the give expression
		 * Displaying the result
		 */
	
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the password");

		String password = sc.next();

		/*
		 * To define regex for password according to rules and matching password with expression given by the user
		 */
		boolean result = Pattern.matches("[a-z]{7,}[A-Z]{1,}", password);

		if (result) {
			System.out.println("Password entered by the user is valid");
		} else {
			System.out.println("Password  entered by the user is invalid");
		}
	}

}
