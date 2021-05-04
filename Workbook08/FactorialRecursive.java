package Workbook08;

public class FactorialRecursive {
  // Property
  private int number;

  // Cpnstructor
  FactorialRecursive(int number) {
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

  // Methods
  // Helper
  public long factorial() {
    return factorialRec(this.number);
  }

  // Recursive method
  private long factorialRec(int n) {
    // base if n is equal to 0 if true return n = 1 otherwise call the method with n - 1
    return n == 0 ? 1 : n * factorialRec(n - 1);
  }
}
