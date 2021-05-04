package Workbook08;

public class FactorialIterative {

  // Property
  private int number;

  // Constructor
  FactorialIterative(int number) {
    setNumber(number);
  }

  // Setter
  public void setNumber(int number) {
    this.number = number;
  }

  // Getter
  public int getNumber() {
    return number;
  }

  // Method
  public long factorial() {
    long fact = 1;

    // the loop will go through for every number and go backwards until is 1 
    // because if we go all the way to 0 it will miltiply by 0 and the result would be 0
    for (int i = getNumber(); i > 1; i--) {
      fact *= i;
    }

    // just return the fact variable
    return fact;
  }

}
