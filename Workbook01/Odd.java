package Workbook01;

import java.util.Scanner;

public class Odd {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // ask for a number input
    System.out.print("Please enter a positive number: ");
    int num = input.nextInt();

    // check if the input is odd or not and output the String if ODD or NOT
    System.out.printf("%s", num % 2 == 0 ? "This is not an Odd number" : "This is an Odd number");

    input.close();
  }

}
