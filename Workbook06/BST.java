package Workbook06;

public class BST {

  private Node root;
  private int size = 0;

  BST() {
    this.root = null;
  }

  public Node search(int key) {
    /**
     * This will only ask the user for the value that he wants to look for and not
     * the tree itself, it will search on the current tree
     */
    return searchRec(root, key);
  }

  private Node searchRec(Node root, int key) {
    /**
     * if the root is null or the root value is equal to the searching value (key),
     * this will return the root Node also when the method called it self will
     * change the root node to the node that we want and return the node with the
     * value to be found or will return a Node null if the the value is not found
     * this if will stop the recursion method
     */
    if (root == null || root.value == key) {
      return root;
    }

    /**
     * if the root value is greater than the search value (key), this will callback
     * the search method recursively but passing the left node of the current node
     * and the search value
     */
    if (root.value > key) {
      return searchRec(root.left, key);
    }

    /**
     * this will work as an if else (root.value < key) if the above ifs aren't true
     * this will call the search method recursively and pass the right node of the
     * current node and the search value
     */
    return searchRec(root.right, key);

  }

  public void sizeAdd() {
    size++;
  }

  public void sizeSub() {
    size--;
  }

  public void insert(int value) {
    this.root = insertion(this.root, value);
  }

  public Node insertion(Node root, int n) {

    if (root == null) {
      root = new Node(n);
      sizeAdd();
      return root;
    }

    if (root.value < n) {
      root.right = insertion(root.right, n);
    } else if (root.value > n) {
      root.left = insertion(root.left, n);
    }

    /** This will handle the case where the value is already in the tree */
    return root;
  }

  public void delete(int key) {

    root = dltRec(root, key);
  }

  private Node dltRec(Node root, int key) {

    if (root == null) {
      sizeSub();
      return root;
    }

    if (root.value < key) {
      root.left = dltRec(root.left, key);
    } else if (root.value > key) {
      root.right = dltRec(root.right, key);
    } else {
      if (root.left == null) {
        return root.right;
      } else if (root.right == null) {
        return root.left;
      }

      root.value = minRec(root.right).value;

      root.right = dltRec(root.right, root.value);
    }

    return root;
  }

  // public void inorder() {

  // }

  // public void postorder() {

  // }

  // public void preorder() {

  // }

  public int getSize() {
    /** This will get the size of the tree */
    return size;
  }

  public boolean isEmpty() {
    /**
     * This will return true if the tree is empty by checking the size of the tree
     */
    return getSize() == 0;
  }

  public int min() {
    /**
     * This min will get the value of the most left child node from the minRec
     * method Recursively
     */
    return minRec(root).value;
  }

  public int max() {
    /**
     * This max will get the value of the most right child node from the maxRec
     * method Recursively
     */
    return maxRec(root).value;
  }

  private Node minRec(Node root) {
    /**
     * This method will return the most left node that contains the minimum value
     * 
     * The terniary operator will check if the the current node has a left node if
     * it has, it menas is not the minimum value so we call back the min method
     * again but sending the left node of the current node recursively until the
     * left node of the current node is null
     */
    return root.left == null ? root : minRec(root.left);
  }

  private Node maxRec(Node root) {
    /**
     * This method will return the most right node that contains the maximum value
     * 
     * same as the min method but with the right node (max number)
     */
    return root.right == null ? root : maxRec(root.right);
  }

}