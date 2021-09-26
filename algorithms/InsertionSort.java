package com.bridgelabz.algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
	/**
	 * @method to sort strings using insertion sort
	 * @param words
	 * uses comparable interface to compare two objects
	 */
	public static void insertionSort(Comparable[] words) {
		for (int i = 1;i < words.length; i++) { 
			Comparable stringToSort = words[i]; 
			int j = i;
			while (j > 0 && words[j - 1].compareTo(stringToSort) > 1) { 
				words[j] = words[j - 1]; 
				j--; 
			} 
			words[j] = stringToSort; 
		} 
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the total number of cities");
		int numberOfWords=sc.nextInt();
		String[] words = new String[numberOfWords];
		String word;
		for(int i=0;i<numberOfWords;i++) {
			word = sc.next();
			words[i]=word;
		}
		System.out.println("String array before sorting : " + Arrays.toString(words));
		insertionSort(words);
		System.out.println("String array after sorting : " + Arrays.toString(words));
	}

}
