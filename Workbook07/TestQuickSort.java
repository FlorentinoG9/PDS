package Workbook07;

public class TestQuickSort {
  public static void main(String[] args) {
    // Init the array
    int[] arr1 = { 2, 3, 2, 5, 6, 1, -2, 3, 14, 12 };
    int[] arr2 = {8,3,4,5,22,-5,-2,7,1,18};
    
    // create the Quicksort object and pass through the array
    System.out.println("Array 1:");
    // sort the array by calling the method quickSort()
    QuickSort qs1 = new QuickSort(arr1);
    qs1.quickSort();


    System.out.println("\nArray 2:");
    QuickSort qs2 = new QuickSort(arr2);
    qs2.quickSort();

  }
}
