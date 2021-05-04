package Workbook08;

public class FibonacciRecursive {

  // property
  private int num;

  // constructor
  FibonacciRecursive(int num){
    setNum(num);
  }

  // setter
  public void setNum(int num) {
    this.num = num;
  }

  // method helper
  public long fibonacci() {
    // this will help us get into the recursive method with the number in this object
    //  this way we can call this method without passing the number again that we already have
    return fibonacciRec(this.num);
  }

  // methods
  public static long fibonacciRec(int n) {
    // base -> n less of equal to 1, if true we return n = 1 or less otherwise we are going to call the recursive fibonacci n - 1 until this section hits n =1 or less after this we are goint to call the recursive method fibonacci n - 2 until we hit the n = 1 or less this will be exponentially grow because every call for this recursive fibonacci will have method n-1 and n-2 so every call will have 2 recursive methods an those methods will call 2 recursive mthods and so on until it hits the base condition on each method ends.
    return n <= 1 ? n : fibonacciRec(n - 1) + fibonacciRec(n - 2);
  }

}
