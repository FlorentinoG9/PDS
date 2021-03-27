package Workbook03;

import java.util.Random;
import java.util.Scanner;

public class BinarySearch {

  /** Variables */
  private int[] array = new int[20];

  /** Constructors */
  // No constructors added

  /** Setters */
  public void setArray() {
    // init the array with random numbers between 1 - 50
    for (int i = 0; i < array.length; i++) {
      this.array[i] = new Random().nextInt(50) + 1;
    }
  }

  /** Getters */
  public String toString() {
    // create a StringBuilder
    StringBuilder strArray = new StringBuilder();

    // append each element of the array into the StringBuilder object 1 by 1
    for (int i = 0; i < array.length; i++) {
      strArray.append(" | " + array[i]);
    }

    // return the StringBuilder Object as a string
    return strArray.toString();
  }

  /** Methods */
  public int binarySearch(int key) {
    // pass through the value to look for in the array
    // init the variables
    int start = 0;
    // the length of the array minus 1
    int end = array.length - 1;
    // get the mid element of the array
    int mid = (int) Math.floor(array.length / 2);

    // cycle throuigh the array while mid term does not match the key value
    // and the start variable is less than or equal to the end variable
    while (array[mid] != key && start <= end) {

      /**
       * if the key value is less than the mid term eliminate the higher numbers in
       * the array and get the end value to the current mid term
       */
      if (key < array[mid])
        end = mid - 1;
      else
        start = mid + 1;
      /**
       * if not assign the mid term to the start value eliminating the lower numbers
       * in the array this way we can search in a much shorter array than the previous
       * one
       */

      /** we chanege the mid term to the new mid term of the new shorter array */
      mid = (int) Math.floor((start + end) / 2);
    }

    /**
     * if the key is equal to the mid value we return the mid value if not we return
     * -1 in this terniary operator
     */
    return key == array[mid] ? mid : -1;
  }

  // Bubble sort
  public void bubbleSort() {
    /**
     * we cycle through the array.lenth - 1 (to not go out of bounds of the array)
     * decreasing i by 1 each cycle
     */
    for (int i = this.array.length - 1; i > 0; i--) {
      /**
       * assign a noSwap variable to check if the array is done finishing sorting
       * numbers and stop cycling throuigh the array
       */
      boolean noSwaps = true;
      /**
       * here we make another loop to compare numbers in the array with j less than i
       * and increasing j so we can optimize the sorting by decreasing i, each cycle
       * we check for less numbers each time we cycle i, and if we do not change any
       * number in a cycle we break the for "i" loop and get out of the loop erlier
       */
      for (int j = 0; j < i; j++) {
        if (this.array[j] > this.array[j + 1]) {
          var temp = this.array[j];
          this.array[j] = this.array[j + 1];
          this.array[j + 1] = temp;
          noSwaps = false;
        }
      }
      if (noSwaps)
        break;
    }
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    BinarySearch s = new BinarySearch();

    // init the array with random numbers
    s.setArray();
    // print the array
    System.out.println(s.toString());

    // Use bubble sort to sort the array so later we can call the binarySearch
    // method
    s.bubbleSort();
    // print the sorted array
    System.out.println(s.toString());

    
    System.out.print("Search value: ");
    System.out.printf("The value is: %d", s.binarySearch(input.nextInt()));

    input.close();
  }

}
