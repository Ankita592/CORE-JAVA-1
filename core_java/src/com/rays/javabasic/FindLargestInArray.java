package com.rays.javabasic;

/*
 * write a method that takes an integer array as a parameter and find the largest number of array
 * 
 * @author: <i>Sushobhit Pandey<i>
 * @since: 2004
 */

public class FindLargestInArray {

	public static void main(String[] args) {
		int[] numbers = {2, 4, 1, -5, 6, 45, 5, 10, 39, 12, 32};
		int largest = getLargest(numbers);
		int s = getSmallest(numbers);
		System.out.println("Larget number : " + largest);
		System.out.println("Smallest number : " + s);
		findLargestAndSecondLargest(numbers);
	}
	
	/*
	 * find and return the largest element in the given array.
	 * @param numbers
	 * @returns largest
	 * 
	 */
	public static int getLargest(int[] numbers) {
		int largest = numbers[0];
		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] > largest) {
				largest = numbers[i];
			}
		}
		
		return largest;
	}
	
	/*
	 * This method prints the largest and second largest element of
	 * given input array.
	 * 
	 */
	public static void findLargestAndSecondLargest(int[] numbers) {
		int largest = numbers[0];
		int secondLargest = numbers[0];
		for (int i = 1; i < numbers.length; i++) {
			if(numbers[i] > largest) {
				secondLargest = largest;
				largest = numbers[i];
			} else if (numbers[i] > secondLargest && numbers[i] != largest) {
				secondLargest = numbers[i];
			}
		}
		System.out.println("Largest : " + largest);
		System.out.println("Second Largest : " + secondLargest);
	}
	
	/*
	 * find and returns the smallest element from the given array.
	 * 
	 * @param numbers
	 * @returns smallest
	 * 
	 */
	public static int getSmallest(int[] numbers) {
		int smallest = numbers[0];
		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] < smallest) {
				smallest = numbers[i];
			}
		}
		return smallest;
	}

}
