package Workbook08;

public class Time {
  public static void main(String[] args) {

    long startTime, endTime;

    
    int fact = 100;
    int fib = 30;

    // Factorial
    FactorialRecursive factRec = new FactorialRecursive(fact);
    FactorialIterative factIter = new FactorialIterative(fact);

    // Fibonacci
    FibonacciIterative fibIter = new FibonacciIterative(fib);
    FibonacciRecursive fibRec = new FibonacciRecursive(fib);

    /** ----------------- Factorial Interative ----------------- */
    // get the start time
    startTime = timer();
    // operation method
    factIter.factorial();
    // get the end time
    endTime = timer();
    System.out.print("Factorial Interative: ");
    System.out.println(duration(startTime, endTime));

    /** ----------------- Factorial Recursive ----------------- */
    // get the start time
    startTime = timer();
    // operation method
    factRec.factorial();
    // get the end time
    endTime = timer();
    System.out.print("Factorial Recusrive: ");
    System.out.println(duration(startTime, endTime));

    System.out.println("------------------------------------------------");

    /** ----------------- Fibonacci Iterative ----------------- */
    // get the start time
    startTime = timer();
    // operation method
    fibIter.fibonacci();
    // get the end time
    endTime = timer();
    System.out.print("Fibonacci Interative: ");
    System.out.println(duration(startTime, endTime));

    /** ----------------- Fibonacci Recursive ----------------- */
    // get the start time
    startTime = timer();
    // operation method
    fibRec.fibonacci();
    // get the end time
    endTime = timer();
    System.out.print("Fibonacci Recusrive: ");
    System.out.println(duration(startTime, endTime));

  }

  public static long timer() {
    return System.nanoTime();
  }

  public static long duration(long start, long end) {
    return (end - start);
  }

}
