package com.bridgelabz.algorithms;

import java.util.Scanner;

/**
 * Java program to find the prime numbers
 * between a given interval
 * @author Mohammad Musthafa
 *
 */
public class PrimeNumbers {

	/**
	 * @method to check prime numbers within a range
	 * @param first
	 * @param last
	 */
	public static void checkForPrime(int first, int last) {
		int flag;
		
		System.out.printf("\nPrime numbers between %d and %d are: ", first, last);
		for (int i = first; i <= last; i++) {
			if (i == 1 || i == 0)		// 1 & 0 are not prime 
				continue;
			flag=1;
			for (int j = 2; j <= i / 2; ++j) {
				if (i % j == 0) {
					flag = 0;
					break;
				}
			}
			
			if (flag == 1)
				System.out.println(i);
		}
		
	}
		
		public static void main(String[] args)
		{
			Scanner sc = new Scanner(System.in);
			int a, b;

			// Ask user to enter lower value of interval
			System.out.printf("Enter lower bound of the interval: ");
			a = sc.nextInt(); // Take input

			System.out.printf("\nEnter upper bound of the interval: ");
			b = sc.nextInt(); // Take input

			checkForPrime(a,b);
			
	}

}

