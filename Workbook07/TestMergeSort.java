package Workbook07;

import java.util.ArrayList;
import java.util.List;

public class TestMergeSort {
  public static void main(String[] args) {
    
    MergeSort mSort = new MergeSort();
    List<Integer> arr = new ArrayList<Integer>();
    // { 2, 3, 2, 5, 6, 1, -2, 3, 14, 12 };

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

    System.out.print("Unsorted: "); 
    printArrayList(arr);

    System.out.print("Sorted: ");
    printArrayList(mSort.mergeSort(arr));

  }

  public static <E> void printArrayList(List<E> arrlist) {
    for (E element : arrlist) {
      System.out.print(element.toString() + " | ");
    }
    System.out.println();
  }
}
