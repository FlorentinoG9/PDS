package Workbook07;

import java.util.ArrayList;
import java.util.List;

public class MergeSort {

  public List<Integer> mergeSort(List<Integer> array) {

    /** Base */
    if (array.size() <= 1) {
      return array;
    } // Base

    /**
     * we need to declare a mid variable to use in the method mergeSort for each
     * side of the sub arrays
     */
    int mid = (int) Math.floor(array.size() / 2);
    /**
     * we have to divide the array into sub arrays so we need to slice in half the
     * current array so we will have a left side and a right side of the array and
     * then call the mergeSort() method to that array from each side
     */
    List<Integer> left = mergeSort(slice(array, 0, mid));
    List<Integer> right = mergeSort(slice(array, mid, array.size()));

    /**
     * then we merge every sub array into a single array by calling the method merge
     * this method will merge the left side with the right side
     */
    return merge(left, right);

  }

  /**
   * Slice method will return to us the left/right array form the primary array as
   * sub arrays that is why we are using List objects so we can slice it
   */
  public static List<Integer> slice(List<Integer> arr, int start, int end) {
    return arr.subList(start, end);
  }

  /**
   * Merge method will help us to sort the elements in the array and putting back
   * together the sub arrays into a single array
   */
  public List<Integer> merge(List<Integer> a, List<Integer> b) {

    List<Integer> c = new ArrayList<Integer>();

    /**
     * we need a counter for each side of the arrays when merging this way if the
     * arrays are not equal in size we can still merging without conflicting an out
     * of bounds event, and if we get to the end of any of the arrays we get out of
     * the loop and add the missing elements of the unfinished array to the merging
     * array
     */
    int i = 0; // left counter
    int j = 0; // right counter

    while (i < a.size() && j < b.size()) {

      /**
       * if the element of the a array is less than the element of the b array then we
       * add it to the c array and increment the i counter which is the left array
       */
      if (a.get(i) < b.get(j)) {
        c.add(a.get(i));
        i++;
      } else {
        /**
         * else add the right side element of the b array and increment the j value by 1
         * and keep comparing values from each array element
         */
        c.add(b.get(j));
        j++;
      }

    }

    /**
     * This while loops will trigger if the arrays arent the same lenght and there
     * are still values unadded from each of the arrays
     */
    while (i < a.size()) {
      c.add(a.get(i));
      i++;
    }

    while (j < b.size()) {
      c.add(b.get(j));
      j++;
    }

    /** return the c array SORTED */
    return c;
  }
}
