package com.grosser;

import java.util.Random;

public class UnsortedUniqueArray {
	
	protected int[] array;
	protected int count;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		UnsortedUniqueArray arrNums = new UnsortedUniqueArray(20);
		Random random = new Random();
		
//		int[] valuesToInsert = new int[] { 234, 456, 564, 346, 456, 732, 627, 754, 467, 23 };
		
		int lastVal = -1;
		int midVal = -1;
		int midVal2 = -1;
		
		// Insert 10 unique random numbers
		for(int i=0; i<10; i++){
			lastVal = random.nextInt(1000);
			arrNums.insert(lastVal);
			if (i == 5){ midVal = lastVal; }
			if (i == 3){ midVal2 = lastVal; }
		}
		
		arrNums.print();
		
		// Find the last inserted number
		arrNums.find(lastVal);
		arrNums.print();
		
		// Delete a specific value
		arrNums.delete(midVal);
		arrNums.print();
		
		arrNums.delete(midVal2);
		arrNums.print();
	}
	
	/**
	 * Creates a new UnsortedUniqueArray with the specified size.
	 * @param size The size of the array to create.
	 */
	public UnsortedUniqueArray(int size) {
		// Initialize the array to the specified size
		this.array = new int[size];
		
		// Initialize the number of array elements to 0
		this.count = 0;
	}
	
	/**
	 * Inserts the value at the next available index in the array.
	 * @param value The value to insert.
	 */
	public void insert(int value){
		
		// Insert the value at the end of the array
		if(count < array.length){
			array[count] = value;
			System.out.println("Inserting value " + value + " at index " + count);
			count++;
			System.out.println("There are now " + count + " total items in the array.");
		} else {
			System.out.println("Cannot insert value - array is full!");
		}
	}
	
	/**
	 * Attempts to delete the current value, if it exists in the array.
	 * @param value The value to delete.
	 */
	public void delete(int value){
		
		// Find the location of the value to delete
		int index = find(value);
		
		// If the value cannot be found, return
		if (index == -1){ System.out.println("Unable to find value to delete!"); return; }
		
		System.out.println("Deleting value " + value + " at index " + index);
		
		// Otherwise, loop through the values to the right and move them all to location-1
		for(int loc = index; loc < count; loc++){
			int nextVal = loc + 1;
			System.out.println("Moving value " + array[nextVal] + " from index " + nextVal + " to index " + loc);
			array[loc] = array[nextVal];
		}
		
		// Decrement the total count
		count--;
	}
	
	/**
	 * Print the value of the array.
	 */
	public void print(){
		System.out.print("Current array: [");
		for(int index = 0; index < array.length; index++){
			System.out.print(" " + array[index]);
		}
		System.out.print("]\n");
	}
	
	/**
	 * Performs a linear search to find the value in O(N) time.
	 * @param value The value to find.
	 * @return the index of the value, if found, or -1 if the value was not found.
	 */
	public int find(int value){
		
		for(int index = 0; index < count; index++){
			if(array[index] == value){
				System.out.println("Found value " + value + " at index " + index);
				return index;
			}
		}
		
		return -1;
	}
}
