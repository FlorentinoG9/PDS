package Workbook08;

import java.util.Scanner;

public class FactorialRecursive {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter a non-negative number: ");
    int n = input.nextInt();

    System.out.printf("The factorial of %d is %d", n, factorial(n));

    input.close();
  }

  public static long factorial(int n) {
    return n == 0 ? 1 : n * factorial(n - 1);
  }
}
