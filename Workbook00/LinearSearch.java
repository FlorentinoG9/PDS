package Workbook00;

import java.util.Random;
import java.util.Scanner;

public class LinearSearch {
  private int[] scores = new int[20];

  public void setScores() {
    for (int i = 0; i < this.scores.length; i++) {
      this.scores[i] = new Random().nextInt(100) + 1;
    }

    printValues();
  }

  public int[] getScores() {
    return scores;
  }

  public int linearSearch(int search) {

    int[] arr = getScores();

    for (int i = 0; i < arr.length; i++) {
      if (search == arr[i]) {
        swapNumber(i);
        return i;
      }
    }

    return -1;
  }

  public void printValues() {

    System.out.print("\n\nList: |");
    for (int i = 0; i < scores.length; i++) {
      System.out.printf("%3d |", scores[i]);
    }
    System.out.println("\n");
  }

  public void swapNumber(int index) {

    int temp = this.scores[index];
    this.scores[index] = this.scores[0];
    this.scores[0] = temp;

  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    LinearSearch score = new LinearSearch();
    int search;

    score.setScores();

    do {

      System.out.print("Looking for item: ");
      int item = input.nextInt();

      search = score.linearSearch(item);

      System.out.printf("%s", search == -1 ? "The item is not in the list" : "The item position index is: " + search);

      score.printValues();
    } while (search != -1);

    input.close();
  }
}
