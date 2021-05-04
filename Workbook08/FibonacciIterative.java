package Workbook08;

public class FibonacciIterative {
  // property
  private int num;

  // constructor
  FibonacciIterative(int num) {
    setNum(num);
  }

  // Setter
  public void setNum(int num) {
    this.num = num;
  }

  // Methods
  public long fibonacci() {
    // Decalre the variables and initialize them
    long x1, x2, x3;
    x1 = 0;
    x2 = 0;
    x3 = 1;

    // System.out.print("0 1 ");
    // num is the number of iterations in this loop and will give us the index
    // number of the value that we want in the fibonacci series.
    for (int i = 1; i < this.num; i++) {
      // x1 is going to add the number before plus the number before this one 
      x1 = x2 + x3;
      //  then we assign the current value fo the x3 number and move it to the x2 number 
      x2 = x3;
      //  and then the last x3 is going to be the same as x1 in the next iteration so the sequence is x2 + x3 = x1 and so on.
      x3 = x1;
      // System.out.printf(" %d ", x1);

    }
    // System.out.println();

    // at the end of the loop we return just x1 which is the number that we are looking for
    return x1;
  }
}
