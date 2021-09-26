package com.bridgelabz.algorithms;
/**
 * Bubble sort program
 * @author Mohammad Musthafa
 *
 */
public class BubbleSort {
	
	/**
	 * method to sort integers using bubble sort technique
	 * @param listOfIntegers
	 */
	    void bubbleSort(int listOfIntegers[]) {
	        int n = listOfIntegers.length;
	        for (int i = 0; i < n-1; i++)
	            for (int j = 0; j < n-i-1; j++)
	                if (listOfIntegers[j] > listOfIntegers[j+1])
	                {
	                    // swap listOfIntegers[j+1] and listOfIntegers[j]
	                    int temp = listOfIntegers[j];
	                    listOfIntegers[j] = listOfIntegers[j+1];
	                    listOfIntegers[j+1] = temp;
	                }
	    }
	  
	    public static void main(String args[]) {
	        BubbleSort ob = new BubbleSort();
	        int listOfIntegers[] = {26, 11, 25, 17, 5, 63, 99};
	        ob.bubbleSort(listOfIntegers);
	        System.out.println("Sorted array");
	        for (int i=0; i<listOfIntegers.length; ++i)
	            System.out.print(listOfIntegers[i] + " ");
	    }
}
