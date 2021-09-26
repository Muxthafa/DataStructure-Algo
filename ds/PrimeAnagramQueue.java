package com.bridgelabz.ds;

import java.util.Arrays;

public class PrimeAnagramQueue {
	
	/**
	 * @method adds anagram primes to queue and prints
	 */
	public void queueanagram() {

		Queue<String> q = new Queue<>();
		String[] primeNumbers = prime(1000);
		System.out.println("Prime anagrams are:");
		for (int i = 0; i < primeNumbers.length; i++) {
			for (int j = i + 1; j < primeNumbers.length; j++) {

				if (anagram(primeNumbers[i], primeNumbers[j])) {
					q.enqueue(primeNumbers[i]);
					q.enqueue(primeNumbers[j]);
					System.out.println(primeNumbers[i] + "\t"  + primeNumbers[j]);
				}
			}
		}
	}

	/**
	 * @param range
	 * @return a String array of all prime numbers
	 */
	public String[] prime(int range) {
		int position = 0;
		String[] array = new String[1000];
		for (int i = 2; i <= range; i++) {
			boolean isPrime = true;
			for (int j = 2; j <= i / 2; j++) {
				if ((i % j) == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				array[position] = String.valueOf(i);
				position++;

			}
		}
		String[] returnArray = new String[position];
		for (int k = 0; k < position; k++) {
			returnArray[k] = array[k];
		}
		return returnArray;
	}

	/**
	 * @param string1
	 * @param string2
	 * @return true if string1 and string2 are anagram else false.
	 */
	public boolean anagram(String string1, String string2) {
		if (string1.length() != string2.length()) {
			return false;
		}
		char[] array1 = string1.toCharArray();
		Arrays.sort(array1);
		char[] array2 = string2.toCharArray();
		Arrays.sort(array2);

		for (int i = 0; i < array1.length; i++) {
			if (array1[i] != array2[i]) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		PrimeAnagramQueue primeAnagramQueue = new PrimeAnagramQueue();
		primeAnagramQueue.queueanagram();
				
	}
}
