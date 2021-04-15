package Workbook06;

public class TreeTest {
  public static void main(String[] args) {
    BST tree = new BST();

    tree.insert(10);
    tree.insert(5);
    tree.insert(3);
    tree.insert(30);
    tree.insert(35);

    System.out.printf("size: %d\n", tree.getSize());
    System.out.printf("min: %d\n", tree.min());
    System.out.printf("max: %d\n", tree.max());
    
    tree.delete(3);
    System.out.printf("size: %d\n", tree.getSize());
    System.out.printf("min: %d\n", tree.min());
    System.out.printf("max: %d\n", tree.max());
  }
}
