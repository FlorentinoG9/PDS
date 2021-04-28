package Workbook07;

import java.util.ArrayList;
import java.util.List;

public class TestMergeSort {
  public static void main(String[] args) {
    
    /** create object of MergeSort O(n Log n) */
    MergeSort mSort = new MergeSort();
    /** Create the array as a Lsit objects */
    List<Integer> arr = new ArrayList<Integer>();
    // { 2, 3, 2, 5, 6, 1, -2, 3, 14, 12 };

    /** Init the Lsit array with the values given */
    arr.add(2);
    arr.add(3);
    arr.add(2);
    arr.add(5);
    arr.add(6);
    arr.add(1);
    arr.add(-1);
    arr.add(3);
    arr.add(14);
    arr.add(12);

    /** print the List Unsorted */
    System.out.print("Unsorted: "); 
    printArrayList(arr);

    /** Print the Sorted List */
    System.out.print("Sorted: ");
    
    /** pass the array list as a parameter */
    printArrayList(mSort.mergeSort(arr));

  }

  /** Print Array List Method */
  public static <E> void printArrayList(List<E> arrlist) {
    for (E element : arrlist) {
      System.out.print(element.toString() + " | ");
    }
    System.out.println();
  }
}
