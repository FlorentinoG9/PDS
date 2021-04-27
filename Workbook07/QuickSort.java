package Workbook07;

public class QuickSort {
  private int pivot;
  private int swapIdx;
  private int[] array;
  private int start;
  private int end;

  QuickSort(int[] array) {
    setArray(array);
    setPivot(array[start]);
    setSwapIdx(0);
    setStart(0);
    setEnd(array.length - 1);

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

  public void setEnd(int end) {
    this.end = end;
  }

  /** Methods */
  public void quickSort() {
    qs(array, 0, array.length - 1);
  }

  public int[] qs(int[] array, int left, int right) {
    if (left < right) {
      int pivotIdx = pivot(array, left, right);
      // left
      qs(array, left, pivotIdx - 1);
      // right
      qs(array, pivotIdx + 1, right);
    }

    printArray();
    return array;
  }

  public int pivot(int[] array, int start, int end) {
    setPivot(array[start]);
    setSwapIdx(start);
    for (int i = start; i <= end; i++) {
      if (pivot > array[i]) {
        swapIdx++;
        swap(array, swapIdx, i);
        printArray();
      }
    }
    swap(array, start, swapIdx);

    System.out.println("swapIdx: " + swapIdx);
    printArray();

    return swapIdx;
  }

  public void printArray() {
    for (int i = 0; i < array.length; i++) {
      System.out.printf(" %2d |", array[i]);
    }
    System.out.println();
  }

  public void swap(int[] array, int i, int j) {
    int temp = array[i];
    array[i] = array[j];
    array[j] = temp;
  }

}
