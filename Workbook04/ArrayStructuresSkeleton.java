package Workbook04;

import java.util.Random;

public class ArrayStructuresSkeleton {

	private int[] theArray = new int[20];

	private int arraySize = theArray.length;

	public void generateRandomArray() {

		for (int i = 0; i < arraySize; i++) {

			theArray[i] = (new Random().nextInt(99) + 1);

		}

	}

	public void printHorzArray(int i, int j) {

		for (int n = 0; n < 51; n++)
			System.out.print("--");

		System.out.println();

		for (int n = 0; n < arraySize; n++) {

			System.out.printf("| %2d ", n);

		}

		System.out.println("|");

		for (int n = 0; n < 51; n++)
			System.out.print("--");

		System.out.println();

		for (int n = 0; n < theArray.length; n++) {

			System.out.printf("| %2d ", theArray[n]);

		}

		System.out.println("|");

		for (int n = 0; n < 51; n++)
			System.out.print("--");

		System.out.println();

		// END OF FIRST PART

		// ADDED FOR BUBBLE SORT

		if (j != -1) {

			// ADD THE +2 TO FIX SPACING

			for (int k = 0; k < ((j * 5) + 2); k++)
				System.out.print(" ");

			System.out.print(j);

		}

		// THEN ADD THIS CODE

		if (i != -1) {

			// ADD THE -1 TO FIX SPACING

			for (int l = 0; l < (5 * (i - j) - 1); l++)
				System.out.print(" ");

			System.out.print(i);

		}

		System.out.println();

	}

	// -------------- SELECTION SORT-----------------
	// Selection sort search for the smallest number in the array
	// saves it in the minimum spot and then repeats searching
	// through the entire array each time

	public void selectionSort() {
		for (int i = 0; i < theArray.length; i++) {
			int lowest = i;
			for (int j = i + 1; j < theArray.length; j++) {
				if (theArray[j] < theArray[lowest]) {
					lowest = j;
				}
			}
			if (i != lowest) {
				swapValues(i, lowest);
			}
		}
	}

	// -------------- INSERTION SORT-----------------
	// The Insertion Sort is normally the best of
	// the elementary sorts. Unlike the other sorts that
	// had a group sorted at any given time, groups are
	// only partially sorted here.

	public void insertionSort() {
		for (int i = 1; i < theArray.length; i++) {
			int current = theArray[i];
			int j = i - 1;

			while (j >= 0 && theArray[j] > current) {
				theArray[j + 1] = theArray[j];
				j = j - 1;
			}
			theArray[j + 1] = current;
		}
	}

	// -------------- BUBBLE SORT-----------------

	// This bubble sort will sort everything from
	// smallest to largest

	public void bubbleSort() {
		for (int i = theArray.length - 1; i > 0; i--) {
			boolean noSwaps = true;
			for (int j = 0; j < i; j++) {
				if (theArray[j] > theArray[j + 1]) {
					swapValues(j, j + 1);
					noSwaps = false;
				}
			}
			if (noSwaps)
				break;
		}
	}

	// -------------- Swap Values-----------------

	public void swapValues(int j, int i) {
		var temp = this.theArray[j];
		this.theArray[j] = this.theArray[i];
		this.theArray[i] = temp;
	}

	// ---------------------TESTING---------------------

	public static void main(String[] args) {

		ArrayStructuresSkeleton newArray = new ArrayStructuresSkeleton();

		System.out.println("-----SelectionSort-----");
		newArray.generateRandomArray();
		newArray.printHorzArray(-1, -1);
		newArray.selectionSort();
		newArray.printHorzArray(-1, -1);

		System.out.println("-----InsertionSort-----");
		newArray.generateRandomArray();
		newArray.printHorzArray(-1, -1);
		newArray.insertionSort();
		newArray.printHorzArray(-1, -1);

		System.out.println("-----BubbleSort-----");
		newArray.generateRandomArray();
		newArray.printHorzArray(-1, -1);
		newArray.bubbleSort();
		newArray.printHorzArray(-1, -1);

	}

}