package com.bridgelabz.algorithms;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BinarySearch {
	static Scanner sc = new Scanner(System.in);

	/**
	 * method to read words from file
	 */
	public static void readFromFile() {
		String key = getKey();
		Scanner x;
		try {
			x = new Scanner(new File("C:\\Users\\mohammad.musthafa_ym\\eclipse-workspace\\AlgorithmProblems\\src\\com\\bridgelabz\\algorithms\\file_input.txt"));
			String words = "";
			while (x.hasNext()) {
				words = words + x.next() + " ";
			}
			String[] arrayOfWords = words.split(" ");
			sort(arrayOfWords, key);

			x.close();

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
	}

	/**
	 * @return key to search
	 */
	private static String getKey() {

		System.out.println("Enter the key");
		String key = sc.nextLine();

		return key;
	}

	/**
	 * method to sort the words
	 * @param arrayOfWords
	 * @param key
	 */
	private static void sort(String[] arrayOfWords, String key) {
		int len = arrayOfWords.length;
		String temp;

		for (int i = 0; i < len - 1; i++) {
			for (int j = 0; j < len - i - 1; j++) {
				if (arrayOfWords[j].compareTo(arrayOfWords[j + 1]) > 0) {
					temp = arrayOfWords[j];
					arrayOfWords[j] = arrayOfWords[j + 1];
					arrayOfWords[j + 1] = temp;

				}
			}
		}

		System.out.println("Sorted array");

		for (String string : arrayOfWords) {
			System.out.print(string + " ");

		}
		System.out.println();
		binarySearch(arrayOfWords, key);
	}

	/**
	 * method to find the key using binary search
	 * @param a
	 * @param key
	 */
	private static void binarySearch(String[] arrayOfWords, String key) {
		int left = 0, right = arrayOfWords.length - 1;
		int mid;
		while (left <= right) {
			mid = (left + right) / 2;

			if (key.compareTo(arrayOfWords[mid]) == 0) {
				System.out.println(key + " found at position " + (mid + 1));
				System.exit(0);
			}
			if (key.compareTo(arrayOfWords[mid]) > 0) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		System.out.println(key+" not found");
	}
	
	public static void main(String[] args) {
		BinarySearch.readFromFile();
	}
}
