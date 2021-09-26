package com.bridgelabz.ds;

public class PrimeNumbers<T> {
	
	public void primeArray() {
		
		int arr[][] = new int[10][100];
		int prime[][] = new int[10][100];
		int temp = 1;

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 100; j++) {

				if (checkPrime(i*100+j+1)) {
					prime[i][j] = i*100+j+1;
				} else {
					prime[i][j] = 0;
				}
			}
		}

		for (int i = 0; i < 10; i++) {
			System.out.print("Prime numbers in range " +(i*100)+ " to " + ((i+1)*100) + ": ");
			for (int j = 0; j < 100; j++) {
				if (prime[i][j] != 0) {
					System.out.print(prime[i][j] + " ");
				}
			}
			System.out.println();
		}
	}

	/**
	 * @param number 
	 * @return true if its prime else false
	 */
	private boolean checkPrime(int number) {

		boolean flag = true;
		for (int i = 2; i <= number / 2; i++) {
			if (number % i == 0) {
				flag = false;
				break;
			}
		}
		return flag;
	}
	
	public static void main(String[] args) {
		PrimeNumbers<Integer> obj = new PrimeNumbers<>();
		obj.primeArray();
	}
}
