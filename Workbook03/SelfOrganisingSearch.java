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

  /** Methods */
  public String toString() {

    StringBuilder strArray = new StringBuilder();

    for (int i = 0; i < array.length; i++) {
      strArray.append(" | " + array[i]);
    }

    return strArray.toString();
  }

  public int search(int value) {

    for (int i = 0; i < array.length; i++) {
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

    input.close();
  }
}
