package Workbook07;

public class QuickSort {
  private int pivot;
  private int left;
  private int[] array;

  
  QuickSort(int[] array){
    setArray(array);
    setLeft(0);
    setPivot(0);
  }

  public void setArray(int[] array) {
    this.array = array;
  }
  public void setLeft(int left) {
    this.left = left;
  }
  public void setPivot(int pivot) {
    this.pivot = pivot;
  }


}
