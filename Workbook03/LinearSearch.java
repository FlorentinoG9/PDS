package Workbook03;

public class LinearSearch {
  private int[] array = new int[20];

  // Constructors
  LinearSearch(int[] array) {
    
  }

  // Setters
  public void setArray(int[] array) {
    this.array = array;
  }


  // Getters
  public int[] getArray() {
    return array;
  }

  // Methods
  public String toString() {

    return "";
  }

  public int search(int value) {

    for (int i = 0; i < array.length; i++) {
      if (value == array[i]) {
        if (i > 0) {
          int temp = array[i-1];
          array[i-1] = array[i];
          array[i] = temp;
        }
        return i;
      }
    }

    return -1;
  }

  public static void main(String[] args) {
    
  }

}
