package Workbook01;

import java.util.Random;

public class Guessing {

  // declared a private variable
  private int number;

  // set method for to assign a value to the variable number
  public void setNumber() {
    this.number = new Random().nextInt(10) + 1;
  }

  // check method to see if the number guessing is the same as the number variable
  public boolean guess(int num) {
    return num == this.number;
  }
}
