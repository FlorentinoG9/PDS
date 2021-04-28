package Workbook08;

import java.util.Scanner;

public class FibonacciIterative {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter a non-negative number: ");
    int n = input.nextInt();

    System.out.printf("The index %d of fibonacci is: %d", n, fibonacci(n));

    input.close();
  }

  public static long fibonacci(int n) {
    long x1, x2, x3;
    x1 = 0;
    x2 = 0;
    x3 = 1;

    System.out.print("0  1 ");
    for (int i = 1; i < n; i++) {
      x1 = x2 + x3;
      x2 = x3;
      x3 = x1;
      System.out.printf(" %d ", x1);

    }
    System.out.println();

    return x1;
  }
}
