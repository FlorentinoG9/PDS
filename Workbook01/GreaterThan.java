package Workbook01;

import java.util.Random;

public class GreaterThan {

  public static void main(String[] args) {

    /*
     * Using a print formatting call the function and pass some random numbers as
     * arguments if the 1st number is greater than the 2nd will return 1, with a
     * ternary operator make a condition to see if the method return 1 or 0 and
     * choose a String to show in the output
     */
    System.out.printf("%s",
        greaterThan(new Random().nextInt(100) + 1, new Random().nextInt(100) + 1) == 1
            ? "1st Num is greater than the 2nd"
            : "2nd Num is greater than the 1st");
  }

  /* Method to compare the numbers given */
  public static int greaterThan(int num1, int num2) {
    System.out.printf("Number 1: %d\nNumber 2: %d\n", num1, num2);
    return num1 > num2 ? 1 : 0;
  }
}
