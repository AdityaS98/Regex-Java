package com.regex;

import java.util.*;

import java.util.regex.Pattern;

import java.util.regex.Matcher;


/**
 * 
 * @author DELL
 *
 */

public class ValidateEmail {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * Declaring Scanner Object 
		 * Define regex for first three letter and matching Email I'd with the give expression for the first three letters 
		 * Displaying the result
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter an Email id");

		String EmailId = sc.next();

		/*
		 * To define regex according to use case and matching email id with expression given by the user
		 */
		boolean result = Pattern.matches("[a][b][c][.][a-z]{1,10}[@][b][l][.][c][o][.][a-z]{1,10}", EmailId);

		if (result) {
			System.out.println("Email id given by the user is valid");
		} else {
			System.out.println("Email id given by the user is invalid");
		}
	}

}
