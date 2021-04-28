package Workbook08;

import java.util.Scanner;

public class FibonacciRecursive {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter a non-negative number: ");
    int n = input.nextInt();

    System.out.printf("The fibonacci of %d is %d", n, fibonacci(n));

    input.close();
  }

  public static long fibonacci(int n) {
    
  }
  

}
