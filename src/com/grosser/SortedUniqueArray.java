package com.grosser;

import java.util.Random;

public class SortedUniqueArray extends UnsortedUniqueArray {

	public SortedUniqueArray(int size) {
		super(size);
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SortedUniqueArray arrNums = new SortedUniqueArray(20);
		Random random = new Random();
		
		int lastVal = -1;
		int midVal = -1;
		int midVal2 = -1;
		
		// Insert 10 unique random numbers
		for(int i=0; i<10; i++){
			lastVal = random.nextInt(1000);
			arrNums.insert(lastVal);
			if (i == 5){ midVal = lastVal; }
			if (i == 3){ midVal2 = lastVal; }
			System.out.println("Value of i: " + i);
		}
		
		arrNums.print();
		
//		// Find the last inserted number
//		arrNums.find(lastVal);
//		arrNums.print();
//		
//		// Delete a specific value
//		arrNums.delete(midVal);
//		arrNums.print();
//		
//		arrNums.delete(midVal2);
//		arrNums.print();
	}
	
	@Override
	public void delete(int value) {
		super.delete(value);
	}
	
	@Override
	public int find(int value) {
		return find(value, 0, count);
	}
	
	@Override
	public void insert(int value) {
		
		// If there are no other values in the array, insert at index 0
		if(count == 0){
			System.out.println("Inserting value " + value + " at index " + (count));
			array[count] = value;
			count++;
			return;
		}
		else{
			// Otherwise, loop through the array starting at index 0 and determine
			// the index to insert the value at
			for(int i=0; i < (count + 1); i++){
				if(array[i] > value){
					
					// Make space for new value
					for(int j=count; j > i; j--){
						array[j] = array[j-1];
					}
					
					// Insert the new value in the space
					System.out.println("Inserting value " + value + " at index " + (count));
					array[i] = value;
					count++;
					return;
				}
			}
			
			// Insert the value at the end
			System.out.println("Inserting value " + value + " at index " + (count));
			array[count] = value;
			count++;
		}
	}
	
	/**
	 * Performs a recursive binary search to find a value between the upper
	 * and lower bounds.
	 * @param value The value being searched for.
	 * @param lowerBound The lower boundary of the array.
	 * @param upperBound The upper boundary of the search.
	 * @return The index of the value, if found, or -1 if the value was not found.
	 */
	private int find(int value, int lowerBound, int upperBound) {
		
		// Verify that both bounds are >= 0
		if(lowerBound < 0 || upperBound < 0){
			return -1;
		}
		
		// Determine if the number is in first half or second half, recursively
		
		// If there is an even number of values, the upper bound is included in
		// the lower half. If there is an odd number of values, the upper bound
		// is the index directly in the middle of the values.
		
		// Split upper bound
		int originalUpperBound = upperBound;
		upperBound = upperBound / 2;

		// Found value
		if(value == array[upperBound]){
			System.out.println("Found value at index " + upperBound);
			return upperBound;
		}
		// Value is in the lower half
		else if(value < array[upperBound]){
			if(lowerBound == upperBound){ return -1; }
			System.out.println("Searching between indexes " + lowerBound + " and " + upperBound);
			return find(value, lowerBound, upperBound);
		}
		// Value is in the upper half
		else{
			if(upperBound == originalUpperBound){ return -1; }
			System.out.println("Searching between indexes " + upperBound + " and " + originalUpperBound);
			return find(value, upperBound, originalUpperBound);
		}
	}

}
