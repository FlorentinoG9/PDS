package Workbook08;

import java.util.Scanner;

public class FibonacciIterative {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter a non-negative number: ");
    int n = input.nextInt();

    System.out.printf("The fibonacci of %d is %d", n, fibonacci(n));

    input.close();
  }

  public static long fibonacci(int n) {
    long fib = 0;

    for (int i = 0; i < n; i++) {
      fib += fib + i;
    }

    return fib;
  }
}
