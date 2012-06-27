package com.grosser;

import com.grosser.array.IntArray;
import com.grosser.array.UnsortedUniqueArray;
import com.grosser.sort.BubbleSort;
import com.grosser.sort.InsertionSort;
import com.grosser.sort.SelectionSort;

/**
 * Class for testing various data structures and sorting/searching algorithms.
 * @author joshuagrosser
 */
public class Client extends Thread implements Runnable {

	/**
	 * Array size constant.
	 */
	private static final int ARRAY_SIZE = 20;
	
	/**
	 * Instance.
	 */
	private static Client client;
	
	/**
	 * Generic unsorted unique array of size n.
	 */
	private IntArray genericUnsortedArray;
	
	/**
	 * Main method. Starting point for the application.
	 * @param args
	 */
	public static void main(String[] args) {
		client = new Client();
		client.start();
	}

	/**
	 * Main thread.
	 */
	@Override
	public void run() {
		System.out.println("\n\nPerforming bubble sort.");
		doBubbleSort();
		
		System.out.println("\n\nPerforming selection sort.");
		doSelectionSort();
		
		System.out.println("\n\nPerforming insertion sort.");
		doInsertionSort();
		
		System.out.println("\n\nPerforming bidirectional bubble sort.");
		doBidirectionalBubbleSort();
	}
	
	private void doBubbleSort(){
		genericUnsortedArray = new UnsortedUniqueArray(ARRAY_SIZE);
		genericUnsortedArray.populate(ARRAY_SIZE);
		genericUnsortedArray = BubbleSort.sort(genericUnsortedArray);
	}
	
	private void doSelectionSort(){
		genericUnsortedArray = new UnsortedUniqueArray(ARRAY_SIZE);
		genericUnsortedArray.populate(ARRAY_SIZE);
		genericUnsortedArray = SelectionSort.sort(genericUnsortedArray);
	}
	
	private void doInsertionSort(){
		genericUnsortedArray = new UnsortedUniqueArray(ARRAY_SIZE);
		genericUnsortedArray.populate(ARRAY_SIZE);
		genericUnsortedArray = InsertionSort.sort(genericUnsortedArray);		
	}
	
	private void doBidirectionalBubbleSort(){
		genericUnsortedArray = new UnsortedUniqueArray(ARRAY_SIZE);
		genericUnsortedArray.populate(ARRAY_SIZE);
		genericUnsortedArray = BubbleSort.sortBidirectional(genericUnsortedArray);
	}
}
