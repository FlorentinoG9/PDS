package Workbook03;

import java.util.Random;
import java.util.Scanner;

public class LinearSearch {
  private int[] array;

  // Constructors
  LinearSearch(int size) {
    setArray(size);
  }

  // Setters
  public void setArray(int size) {
    /** will create the array of the size given when creating the object */
    this.array = new int[size];
 /** assig random numbers inside the array between 1 and 20 */
    for (int i = 0; i < this.array.length; i++) {
      this.array[i] = new Random().nextInt(20) + 1;
    }
  }

  // Methods
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

  public int search(int value) {
    /**
     * cycle through the array and if the value that you look gor matches the a
     * value inside the array will return the index of that value inside the array
     * if not will return -1
     */
    for (int i = 0; i < array.length; i++) {
      if (value == array[i]) {
        return i;
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    /** ask for the size of the array when creating the object */
    System.out.print("Enter size of the array: ");
    LinearSearch obj = new LinearSearch(input.nextInt());

    /** print the array */
    System.out.printf("%s |", obj.toString());

    /** do a while loop to do multiple searches with the same array */
    int x = 0;
    while (x < 5) {
      /**
       * ask for the value to look for in the array and assign it to the variable
       * search if the value is not found will return a string "value not found" but
       * id the value is found will get a string saying that the index is whatever
       * number is the value in
       */
      System.out.print("\n\nSearch for a Value: ");
      int search = obj.search(input.nextInt());
      System.out.printf("%s", search == -1 ? "Value not found" : "The index value was: " + search);
      /** print the array */
      System.out.printf("\n\n%s |", obj.toString());
      /** increase x value by 1 */
      x++;
    }

    input.close();
  }
}
