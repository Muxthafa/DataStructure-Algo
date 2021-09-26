package com.bridgelabz.ds;

import java.util.Scanner;

public class Palindrome {
	static Scanner scanner = new Scanner(System.in);

	static Dequeue<Character> deque = new Dequeue<>();

	/**
	 * @method checks if given string is palindrome
	 */
	public static void checkPalindrome() {
		System.out.println("Enter the string");
		String string = scanner.next();
		string = string.toLowerCase();
		char[] charArray = string.toCharArray();
		String reversedString = "";
		for (int i = 0; i < charArray.length; i++) {
			deque.addFront(charArray[i]);
		}

		for (int i = 0; i < charArray.length; i++) {
			reversedString += deque.removeFront();
		}

		if (string.equals(reversedString)) {
			System.out.println(string + " is a palindrome");
		} else {
			System.out.println(string + " is not a palindrome");
		}

	}
	public static void main(String[] args) {
		checkPalindrome();
	}
}
