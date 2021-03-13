package Workbook01;

public class Initials {
  // declare a private variable
  private char initial;

  // add a setter for the variable
  public void setInitial(char initial) {
    this.initial = initial;
  }

  // getter for the variable
  public char getInitial() {
    return initial;
  }

  // check a passing parameter to check if the char ASCII value is greater or less
  // with the order alphabetically
  public boolean checkInits(char initial1) {
    return this.initial < initial1;
  }
}
