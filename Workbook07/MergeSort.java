package Workbook07;

import java.util.ArrayList;
import java.util.List;

public class MergeSort {

  public List<Integer> mergeSort(List<Integer> array) {

    if (array.size() <= 1) { return array; }

    int mid = (int) Math.floor(array.size() / 2);
    List<Integer> left = mergeSort(slice(array, 0, mid));
    List<Integer> right = mergeSort(slice(array, mid, array.size()));

    return merge(left, right);

  }

  public static List<Integer> slice(List<Integer> arr, int start, int end) {
    return arr.subList(start, end);
  }

  public List<Integer> merge(List<Integer> a, List<Integer> b) {

    List<Integer> c = new ArrayList<Integer>();
    int i = 0;
    int j = 0;

    while (i < a.size() && j < b.size()) {

      if (a.get(i) < b.get(j)) {
        c.add(a.get(i));
        i++;
      } else {
        c.add(b.get(j));
        j++;
      }

    }

    while (i < a.size()) {
      c.add(a.get(i));
      i++;
    }

    while (j < b.size()) {
      c.add(b.get(j));
      j++;
    }

    return c;
  }
}
