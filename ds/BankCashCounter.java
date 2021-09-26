package com.bridgelabz.ds;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

/**
 * program to allow people to perform operation in queue
 * @author mohammad.musthafa_ym
 *
 */
public class BankCashCounter {
	
	Scanner r = new Scanner(System.in);
	long minBalance = 1000;

	Queue<Integer> queue = new PriorityQueue<>();

	/**
	 * @method adds people in the queue
	 */
	public void addPerson() {

		System.out.println("Number of people:");
		int n = r.nextInt();
		for (int i = 0; i < n; i++) {
			queue.add(i);
		}
		getOption(n);

	}

	/**
	 * @method to perform withdraw or deposit operation
	 * @param noOfPeople 
	 */
	private void getOption(int noOfPeople) {
		int count = 0;

		while (count != noOfPeople) {
			long cash = minBalance;

			int option = 0;

			System.out.println("Person " + (count + 1) + " at the counter");
			System.out.println("Available cash " + cash);
			System.out.println("You want to \n1: Withdraw \n2: Deposit");
			option = r.nextInt();
			switch (option) {
			case 1:
				System.out.println("Enter the amount to withdraw");
				long amount = r.nextInt();
				if (amount > cash) {
					System.out.println("Not enough money in account");
				} else
					cash = cash - amount;
				queue.remove();
				count++;
				System.out.println("Person " + count + " available cash:" + cash);
				
				break;
			case 2:
				System.out.println("Enter the required amount to deposit");
				long amount1 = r.nextInt();
				System.out.println("amount deposited successfully");
				queue.remove();
				cash = cash + amount1;
				count++;
				System.out.println("Person " + (count + 1) + " available cash:" + cash);
				
				break;
			default:
				System.out.println("Invalid input");

			}
		}
	}
	public static void main(String[] args) {
		BankCashCounter bankCashCounter = new BankCashCounter();
		bankCashCounter.addPerson();
	}
}
