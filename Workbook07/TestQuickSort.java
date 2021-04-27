package Workbook07;

public class TestQuickSort {
  public static void main(String[] args) {
    int[] arr = { 2, 3, 2, 5, 6, 1, -2, 3, 14, 12 };
    
    QuickSort qs = new QuickSort(arr);

    qs.quickSort();
  }
}
