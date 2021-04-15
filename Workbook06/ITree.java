package Workbook06;

public interface ITree {
  /** Return true if the element is in the tree */
  public boolean search();

  /**
   * Insert element e into the binary search tree. Return true if the element is
   * inserted successfully.
   */
  public boolean insert();

  /**
   * Delete the specified element from the tree. Return true if the element is
   * deleted successfully.
   */
  public boolean delete();

  /** Inorder traversal from the root */
  public void inorder();

  /** Postorder traversal from the root */
  public void postorder();

  /** Preorder traversal from the root */
  public void preorder();

  /** Get the minimum value in the tree */
  public int min();
  
  /** Get the maximum value in the tree */
  public int max();

  /** Get the number of nodes in the tree */
  public int getSize();

  /** Return true if the tree is empty */
  public boolean isEmpty();
}
