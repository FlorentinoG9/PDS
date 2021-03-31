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
			int lowest = i; // assign the lowest potition
			for (int j = i + 1; j < theArray.length; j++) {
				// if the array of potition j is lower than potition array with the lowest
				// variable
				if (theArray[j] < theArray[lowest]) {
					lowest = j; // first we assign the lowest variable to the current value of j
				}
			}
			// if the current value of i is not equal to the lowest variable
			// it means that we change the value of j therefore we change potitions
			// and call the method to swap the vlaues form the current potition of i and the
			// potition of j if we switch the potition
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

	// the insertion sort is a little but different than the others
	// since it will take out the current value and see if we insert it into another
	// place in the array
	//
	public void insertionSort() {
		for (int i = 1; i < theArray.length; i++) {
			int current = theArray[i]; // take the current numbe
			int j = i - 1; // declare the variable j for the while loop

			// compare the current position above with the lower potitions in the array
			while (j >= 0 && theArray[j] > current) {
				// if the current number is lower than the next potition
				// switch places
				theArray[j + 1] = theArray[j];
				j = j - 1;
			}
			// and get the next potition in the array will be assign to the current number
			theArray[j + 1] = current;
		}
	}

	// -------------- BUBBLE SORT-----------------

	// This bubble sort will sort everything from
	// smallest to largest

	public void bubbleSort() {

		for (int i = theArray.length - 1; i > 0; i--) {
			boolean noSwaps = true; // assign a boolean variable to check if there was a swap
			for (int j = 0; j < i; j++) {
				// here we compare the values of the array
				// if it goes thorugh call the method to swap the values
				// and assign the value of noswaps to false so we can keep looping throught the
				// array
				if (theArray[j] > theArray[j + 1]) {
					swapValues(j, j + 1);
					noSwaps = false;
				}
			}
			// if not swaps happend the loop will break and end looping through
			if (noSwaps)
				break;
		}
	}

	// -------------- Swap Values-----------------

	public void swapValues(int j, int i) {

		var temp = this.theArray[j];// store the value before changing the potition
		this.theArray[j] = this.theArray[i];// assignt the value to the right potition
		this.theArray[i] = temp; // assign the used potition to the temp variable
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