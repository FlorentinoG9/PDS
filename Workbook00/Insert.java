package Workbook00;

import java.util.Random;
import java.util.Scanner;

public class Insert {
  private int[] studentScores = new int[20];

  public void setStudentScores(int value, int index) {
    this.studentScores[index] = value;

    printValues(this.studentScores);
  }

  public int[] getStudentScores() {
    return studentScores;
  }

  public void printValues(int[] studentScores) {

    System.out.print("|");
    for (int i = 0; i < studentScores.length; i++) {
      System.out.printf("%3d |", studentScores[i]);
    }
    System.out.println("\n\n");
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    Insert value = new Insert();

    int[] arr = value.getStudentScores();

    for (int i = 0; i < arr.length; i++) {
      int newValue = new Random().nextInt(100) + 1;
      System.out.print("Positions Available: ");
      System.out.print("|");
      for (int j = 0; j < arr.length; j++) {
        if (arr[j] == 0) {
          System.out.printf(" %d |", j + 1);
        }
      }
      System.out.println();
      System.out.print("Insert Position: ");
      int index = input.nextInt() - 1;
      value.setStudentScores(newValue, index);
    }

    input.close();

  }
}
