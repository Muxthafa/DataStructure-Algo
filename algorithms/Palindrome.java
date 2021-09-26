package com.bridgelabz.algorithms;

public class Palindrome {

	/**
	 * @method to find all the prime numbers between 0-10000
	 */
	public static void primeNumber() {

		for (int i = 2; i <= 1000; i++) {
			boolean flag = true;
			for (int j = 2; j <= i / 2; j++) {
				if (i % j == 0) {
					flag = false;
					break;
				}
			}
			if (flag) {
				palindrome(i);
			}
		}

	}

	/**
	 * @method to check if a number is palindrome or not
	 * @param i
	 */
	private static void palindrome(int i) {
		int reminder, num, reversedNum = 0;
		num = i;
		int count = 0;
		while (i != 0) {
			reminder = i % 10;
			reversedNum = reversedNum * 10 + reminder;
			i = i / 10;
			count++;

		}
		if (num == reversedNum && count > 1) {
			System.out.print(num + " ");
		}

	}

	public static void main(String[] args) {
		System.out.println("Prime numbers between 0 to 1000 that are palindrome:");
		Palindrome.primeNumber();
	}
}
