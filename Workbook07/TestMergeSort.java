package Workbook07;

import java.util.ArrayList;
import java.util.List;

public class TestMergeSort {
  public static void main(String[] args) {
    
    /** create object of MergeSort O(n Log n) */
    MergeSort mSort = new MergeSort();
    /** Create the array as a Lsit objects */
    List<Integer> arr1 = new ArrayList<Integer>();
    // { 2, 3, 2, 5, 6, 1, -2, 3, 14, 12 };
    List<Integer> arr2 = new ArrayList<Integer>();
    // list2 {8,3,4,5,22,-5,-2,7,1,18} 

    /** Init the Lsit array with the values given */
    arr1.add(2);
    arr1.add(3);
    arr1.add(2);
    arr1.add(5);
    arr1.add(6);
    arr1.add(1);
    arr1.add(-1);
    arr1.add(3);
    arr1.add(14);
    arr1.add(12);

    /** Init the Lsit array with the values given */
    arr2.add(8);
    arr2.add(3);
    arr2.add(4);
    arr2.add(5);
    arr2.add(22);
    arr2.add(-5);
    arr2.add(-2);
    arr2.add(7);
    arr2.add(1);
    arr2.add(18);

    /** Array 1 */
    /** print the List Unsorted */
    System.out.println("Array 1:");
    System.out.print("Unsorted: "); 
    printArrayList(arr1);
    /** Print the Sorted List */
    System.out.print("Sorted: ");
    /** pass the array list as a parameter */
    printArrayList(mSort.mergeSort(arr1));
    
    System.out.println();
    
    /** Array 2 */
    System.out.println("Array 2:");
    System.out.print("Unsorted: "); 
    printArrayList(arr2);
    System.out.print("Sorted: ");
    printArrayList(mSort.mergeSort(arr2));


  }

  /** Print Array List Method */
  public static <E> void printArrayList(List<E> arrlist) {
    for (E element : arrlist) {
      System.out.print(element.toString() + " | ");
    }
    System.out.println();
  }
}
