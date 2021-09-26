package com.bridgelabz.algorithms;

import java.util.Scanner;

public class GuessGame {
	static Scanner sc = new Scanner(System.in);

	static int find() {

		int low = 0, high = 127, mid;
		while (low != high) {
			mid = (low + high) / 2;
			System.out.println("enter 1 if no is between " + low + " - " + mid + "\nEnter 2 if no is between "
					+ (mid + 1) + " - " + high);
			int c = sc.nextInt();
			mid = (low + high) / 2;
			if (c == 1)
				high = mid;
			else
				low = mid + 1;
		}
		return low;
	}

	public static void main(String[] args) {
		int guessedNumber = Integer.parseInt(args[0]);
		try {
			int result = find();
			if(result == guessedNumber)
				System.out.println("guessed no is " + result);
			else
				System.out.println("Not true");
		} catch (Exception e) {
			System.out.println("enter correct input");
		}
	}
}
