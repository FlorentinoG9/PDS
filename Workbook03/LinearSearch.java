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
    this.array = new int[size];

    for (int i = 0; i < this.array.length; i++) {
      this.array[i] = new Random().nextInt(20) + 1;
    }
  }

  // Methods
  public String toString() {
    // create a StringBuilder
    StringBuilder strArray = new StringBuilder();

    // append each element of the array into the StringBuilder object
    for (int i = 0; i < array.length; i++) {
      strArray.append(" | " + array[i]);
    }

    // return the StringBuilder Object as a string
    return strArray.toString();
  }

  public int search(int value) {
    for (int i = 0; i < array.length; i++) {
      if (value == array[i]) {
        return i;
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter size of the array: ");
    LinearSearch obj = new LinearSearch(input.nextInt());

    System.out.printf("%s |", obj.toString());

    int x = 0;
    while (x < 5) {
      System.out.print("\n\nSearch for a Value: ");
      int search = obj.search(input.nextInt());
      System.out.printf("%s", search == -1 ? "Value not found" : "The index value was: " + search);

      System.out.printf("\n\n%s |", obj.toString());
      x++;
    }

    input.close();
  }
}
