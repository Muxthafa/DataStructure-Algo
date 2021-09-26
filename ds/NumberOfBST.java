package com.bridgelabz.ds;

public class NumberOfBST {
	
	/**
	 * @param num
	 * @return the factorial of number
	 */
	public static int factorial(int num) {
		int fact = 1;
		if (num == 0)
			return 1;
		return (num * factorial(num - 1));
	}

	/**
	 *@method to count no. of nodes
	 */
	public static void numOfBST(int numOfNode) {
		int catalanNumber = factorial(2 * numOfNode) / (factorial(numOfNode) * factorial(numOfNode + 1));
		System.out.println("Number of binary search tree with " + numOfNode + " node is " + catalanNumber);
	}

	public static void main(String[] args) {
		numOfBST(3);
	}
}
