package Workbook07;

public class TestQuickSort {
  public static void main(String[] args) {
    // Init the array
    int[] arr = { 2, 3, 2, 5, 6, 1, -2, 3, 14, 12 };
    
    // create the Quicksort object and pass through the array
    QuickSort qs = new QuickSort(arr);

    // sort the array by calling the method quickSort()
    qs.quickSort();
  }
}
