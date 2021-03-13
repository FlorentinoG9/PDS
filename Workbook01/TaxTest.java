package Workbook01;

import java.util.Scanner;

public class TaxTest {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // Create an object in order to use the method we created
    Tax payer = new Tax();

    // create an array that holds the amount of the tax payers
    double[] taxPayer = new double[2];

    // Assign the amount for each tax payer
    for (int i = 0; i < taxPayer.length; i++) {
      System.out.printf("Enter Salary of Payer %d:", i + 1);
      taxPayer[i] = input.nextDouble();
    }

    // get in return the amount the its need to be paid from the tax payers
    // calling the mehtod from the object
    System.out.printf("The tax to be paid is: $%.2f", payer.payTax(taxPayer));

    input.close();
  }
}
