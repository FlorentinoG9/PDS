package Workbook03;

import java.util.Random;
import java.util.Scanner;

public class SelfOrganisingSearch {
  /** Variables */
  private int[] array;

  /** Constructors */
  SelfOrganisingSearch(int size) {
    setArray(size);
  }

  /** Setters */
  public void setArray(int size) {
    this.array = new int[size];

    for (int i = 0; i < this.array.length; i++) {
      this.array[i] = new Random().nextInt(20) + 1;
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

  public int search(int value) {
    /**
     * cycle through the array and if the value that you look gor matches the a
     * value inside the array will return the index of that value inside the array
     * if not will return -1
     */
    for (int i = 0; i < array.length; i++) {
      /**
       * if the value is found will store the value in a temp variable and then move
       * every element in the array from the current position where the number was
       * found and and move every element 1 potiion up to 0 (first element in the array)
       * then assign the temp variable to the first potition in the array
       */
      if (value == array[i]) {
        int temp = array[i];
        for (int j = i; j > 0; j--) {
          array[j] = array[j - 1];
        }
        array[0] = temp;
        return i;
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    /** ask for the size of the array when creating the object */
    System.out.print("Enter size of the array: ");
    SelfOrganisingSearch obj = new SelfOrganisingSearch(input.nextInt());

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
