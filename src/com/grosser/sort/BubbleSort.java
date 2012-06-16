package com.grosser.sort;

import com.grosser.array.IntArray;

public class BubbleSort {
	
	/**
	 * Static bubble sort method. Pass in an array of integers to be sorted,
	 * and the method will sort the integers in O(N2) time, and then return
	 * the sorted array, where N is the number of items in the array.
	 * 
	 * @param arrayToSort
	 * @return The sorted array.
	 */
	public static IntArray sort(IntArray arrayToSort){
		
		// Outer Loop
		// Loop until all values have been sorted. This will be when the outer index
		// reaches 0.
		
		// n is the index of the last value in the array
		int n = arrayToSort.size() - 1;
		
		// Outer loop
		for(int outer = n; outer >= 0; outer--){
			
			// Inner loop comparing and swapping values
			for(int inner = 0; inner < outer; inner++){
				
				// Inner Loop
				// Starting at index 0, compare indices 0 and 1. If 0 is bigger than 1, swap
				// the values. Then move on to indices 1 and 2, and so on, until the comparisons
				// end at indices n-1 and n. The largest value will be at the end.
				
				// Next, do the same loop through indices 0 through n-1. Now n and n-1 are sorted.
				// Continue looping through in this manner.
				
				if(arrayToSort.get(inner) > arrayToSort.get(inner + 1)){
					arrayToSort = swap(arrayToSort, inner, inner + 1);
				}
			}
		}
		
		return arrayToSort;
	}
	
	/**
	 * Swaps the values in the array at indices firstIndex and secondIndex.
	 * @param array The array whose values are being swapped.
	 * @param firstIndex The index of the first value to swap.
	 * @param secondIndex The index of the second value to swap.
	 * @return The array with the selected values swapped.
	 */
	protected static IntArray swap(IntArray array, int firstIndex, int secondIndex){
		int tempVal = array.get(firstIndex);
		array.set(firstIndex, array.get(secondIndex));
		array.set(secondIndex, tempVal);
		return array;
	}
}
