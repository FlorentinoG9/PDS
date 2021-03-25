package Workbook03;

public class BinarySearch {

  /** Variables */

  /** Constructors */

  /** Setters */

  /** Getters */

  /** Methods */
  public int binarySearch(int[] arr, int key) {
    int start = 0;
    int end = arr.length - 1;
    int mid = (int) Math.floor(arr.length / 2);

    while (arr[mid] != key && start <= end) {

      if (key < arr[mid])
        end = mid - 1;
      else
        start = mid + 1;
      mid = (int) Math.floor((start + end) / 2);
    }

    return key == arr[mid] ? mid : -1;
  }

}
