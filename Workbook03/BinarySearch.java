package Workbook03;

import java.util.Random;
import java.util.Scanner;

public class BinarySearch {

  /** Variables */
  private int[] array = new int[20];

  /** Constructors */

  /** Setters */
  public void setArray() {
    for (int i = 0; i < array.length; i++) {
      this.array[i] = new Random().nextInt(50) + 1;
    }
  }

  /** Getters */
  public String toString() {

    StringBuilder strArray = new StringBuilder();

    for (int i = 0; i < array.length; i++) {
      System.out.print("-----");
    }
    System.out.println();
    for (int i = 0; i < array.length; i++) {
      strArray.append(" | " + array[i]);
    }

    return strArray.toString();
  }

  /** Methods */
  public int binarySearch(int key) {
    int start = 0;
    int end = array.length - 1;
    int mid = (int) Math.floor(array.length / 2);

    while (array[mid] != key && start <= end) {

      if (key < array[mid])
        end = mid - 1;
      else
        start = mid + 1;
      mid = (int) Math.floor((start + end) / 2);
    }

    return key == array[mid] ? mid : -1;
  }

  public void bubbleSort() {
    for (int i = this.array.length - 1; i > 0; i--) {
      boolean noSwaps = true;
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

    s.setArray();
    System.out.printf("%s\n\n", s.toString());

    s.bubbleSort();
    System.out.printf("%s\n\n", s.toString());

    System.out.print("Search value: ");
    System.out.printf("The value is: %d", s.binarySearch(input.nextInt()));

    input.close();
  }

}
