package Workbook07;

public class QuickSort {
  private int pivot;
  private int swapIdx;
  private int[] array;
  private int start;

  /** Constructor */
  QuickSort(int[] array) {
    setArray(array);
    setPivot(array[start]);
    setSwapIdx(0);
    setStart(0);

    /** Print the Unosrted Array first */
    System.out.print("Unsorte:");
    printArray();
  }

  /** Setters */
  public void setArray(int[] array) {
    this.array = new int[array.length];
    this.array = array;
  }

  public void setSwapIdx(int swapIdx) {
    this.swapIdx = swapIdx;
  }

  public void setPivot(int pivot) {
    this.pivot = pivot;
  }

  public void setStart(int start) {
    this.start = start;
  }

  /** Methods */
  /**
   * this will call the method qs as an recursive helper method so we dont have to
   * add parameters when calling the sort method
   */
  public void quickSort() {
    /**
     * 
     * call the recursive method pass the array method inside this object the start
     * value index and the end of the array where we are going to look for different
     * values comparing the index
     */
    qs(array, 0, array.length - 1);

    /** print the final and sorted array */
    System.out.print("Sorted: ");
    printArray();
  }

  public int[] qs(int[] array, int left, int right) {
    /**
     * this if will be our base for the recursive method
     */
    if (left < right) { // base
      /**
       * we are going to call a pivot method wich will get us our current pivot from
       * each sub array to sort
       */
      int pivotIdx = pivot(array, left, right);
      // left
      /**
       * get the left side of the array our pivot will always start at 0 it can start
       * anywhere but we are choosing the first element in the array in this case left
       * is = 0 so we are checking everytime from start point 0 to whatever value is
       * pivotIdx - 1 this will give us the sub array with out the pivot element which
       * is already in its place so we dont want the value because is already sorted
       */
      qs(array, left, pivotIdx - 1);
      // right
      /**
       * get the right side of the array same as the left side but in this case the
       * fixed number is going to be the last element in the array (right value) which
       * is array.lenght - 1 and of course the pivotIdx + 1 this will give us the
       * right side of the array without the value that is already sorted
       */
      qs(array, pivotIdx + 1, right);
    }

    /** Finally we are going to return the array */
    return array;
  }

  public int pivot(int[] array, int start, int end) {
    /**
     * we need to set the pivot number to the current pivot value in each sub array
     */
    setPivot(array[start]);
    /** same with the potition we are going to start swaping number in each array */
    setSwapIdx(start);

    // Since we are using this as a recursive method there is 2 situations in this
    // loop:
    /**
     * 
     * Left Side: start value is going to be the 0 for the left side and the end
     * value is going to be the pivot index - 1
     * 
     * Right Side: start value = to the pivot index + 1 end value is a fixed wich is
     * the lenght of the array - 1
     */
    for (int i = start; i <= end; i++) {
      /**
       * if the pivot number is greather than the element in the array we add 1 to
       * swapIdx and swap the numbers by calling the method swap()
       */
      if (pivot > array[i]) {
        /**
         * swapIdx will be our counter to move the poivot number to the right potition
         */
        /**
         * basiclly what we are doing here is move every single number less than out
         * pivot number to the left side and keep all the numbers greater than our pivot
         * number to the right
         */
        swapIdx++;
        swap(array, swapIdx, i);
      }
    }
    /**
     * after moving al the numbers to the left and right of our pivot number is time
     * to put our pivot number in its right potition in the array
     */
    swap(array, start, swapIdx);

    /**
     * and return our swapIndx which is going to be our next pivot number in the
     * following sub arrays
     */
    return swapIdx;
  }

  /** this will print our array so we can see the changes */
  public void printArray() {
    for (int i = 0; i < array.length; i++) {
      System.out.printf(" %2d |", array[i]);
    }
    System.out.println();
  }

  /** basic swaping algorithm to sort values */
  public void swap(int[] array, int i, int j) {
    int temp = array[i];
    array[i] = array[j];
    array[j] = temp;
  }

}
