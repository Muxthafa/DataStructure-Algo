package com.bridgelabz.algorithms;

public class Permutation {
	
	/**
	 * @param word
	 * @param temp
	 * prints all possible permutations of a string
	 */
	static void printPermutation(String word, String temp)
	{
		if (word.length() == 0) {
			System.out.print(temp + " ");
			return;
		}
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			String per = word.substring(0, i) + word.substring(i + 1);
			printPermutation(per, temp + ch);
		}
	}

	public static void main(String[] args)
	{
		String word = "xyz";
		System.out.println("The permutations of " +word+ " are:");
		printPermutation(word, "");
	}
}
